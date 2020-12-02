import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:pokemao_dexter/core/network.dart';
import 'package:pokemao_dexter/data/repositories/pokemon_repository.dart';
import 'package:pokemao_dexter/data/repositories/pokemon_repositoy.dart';
import 'package:pokemao_dexter/data/source/github/github_datasource.dart';
import 'package:pokemao_dexter/data/source/local/local_datasource.dart';
import 'package:pokemao_dexter/domain/usecases/pokemon_usecases.dart';
import 'package:pokemao_dexter/states/states.dart';

part 'data_sources.dart';
part 'repositories.dart';
part 'services.dart';
part 'states.dart';
part 'use_cases.dart';
