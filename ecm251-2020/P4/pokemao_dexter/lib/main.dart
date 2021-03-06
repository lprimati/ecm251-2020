import 'dart:math';

import 'package:flutter/material.dart';
import 'package:pokemao_dexter/configs/colors.dart';
import 'package:pokemao_dexter/configs/constants.dart';
import 'package:pokemao_dexter/configs/fonts.dart';
import 'package:pokemao_dexter/data/source/local/local_datasource.dart';
import 'package:pokemao_dexter/routes.dart';

//Lucas Primati Menezes 16.00683-6

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  await LocalDataSource.initialize();

  runApp(ProviderScope(child: PokedexApp()));
}

Widget ProviderScope({PokedexApp child}) {
}



class PokedexApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);

    return MaterialApp(
      color: Colors.white,
      title: 'Pokemao Dexter',
      theme: ThemeData(
        fontFamily: AppFonts.circularStd,
        textTheme: theme.textTheme.apply(
          fontFamily: AppFonts.circularStd,
          displayColor: AppColors.black,
        ),
        scaffoldBackgroundColor: AppColors.lightGrey,
        primarySwatch: Colors.blue,
      ),
      navigatorKey: AppNavigator.navigatorKey,
      onGenerateRoute: AppNavigator.onGenerateRoute,
      builder: (context, child) {
        final data = MediaQuery.of(context);
        final smallestSize = min(data.size.width, data.size.height);
        final textScaleFactor = min(smallestSize / AppConstants.designScreenSize.width, 1.0);

        return MediaQuery(
          data: data.copyWith(
            textScaleFactor: textScaleFactor,
          ),
          child: child,
        );
      },
    );
  }
}
