import 'dart:math';

import 'package:flutter/material.dart';
import 'package:pokemao_dexter/configs/colors.dart';
import 'package:pokemao_dexter/configs/images.dart';
import 'package:pokemao_dexter/core/extensions/context.dart';
import 'package:pokemao_dexter/data/categories.dart';
import 'package:pokemao_dexter/routes.dart';
import 'package:pokemao_dexter/ui/widgets/poke_category_card.dart';
import 'package:pokemao_dexter/ui/widgets/poke_container.dart';
import 'package:pokemao_dexter/ui/widgets/poke_news.dart';
import 'package:pokemao_dexter/ui/widgets/search_bar.dart';
import 'package:pokemao_dexter/ui/widgets/spacer.dart';

part 'widgets/header_app_bar.dart';
part 'widgets/pokemon_news.dart';

class HomeScreen extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  final ScrollController _scrollController = ScrollController();

  double appBarHeight = 0;
  bool showTitle = false;

  @override
  void initState() {
    _scrollController.addListener(_onScroll);

    super.initState();
  }

  @override
  void dispose() {
    _scrollController.dispose();

    super.dispose();
  }

  void _onScroll() {
    if (!_scrollController.hasClients) return;

    final offset = _scrollController.offset;

    setState(() {
      showTitle = offset > appBarHeight - kToolbarHeight;
    });
  }

  @override
  Widget build(BuildContext context) {
    appBarHeight = context.screenSize.height * _HeaderAppBar.heightFraction;

    return Scaffold(
      body: NestedScrollView(
        controller: _scrollController,
        headerSliverBuilder: (_, __) => [
          _HeaderAppBar(
            height: appBarHeight,
            showTitle: showTitle,
          ),
        ],
        body: _PokemonNews(),
      ),
    );
  }
}
