# Meus Gastos

Projeto Android em Kotlin com Jetpack Compose.

## Correções realizadas
- Implementado `GastoRepository` e sua implementação em memória, que estavam ausentes.
- Corrigida a leitura de valores monetários, aceitando vírgula decimal e separador de milhar.
- Adicionado teclado numérico decimal ao campo de valor.
- Ajustada a lista para ocupar o espaço restante da tela, com chaves estáveis.
- Incluído estado vazio para quando não houver gastos ou não houver resultados no filtro.
- Aplicado o tema visual próprio do projeto na Activity.
- Gerados IDs de gastos com incremento para evitar colisões no mesmo milissegundo.

## Observação importante
A implementação atual do repositório mantém os dados apenas em memória. Os gastos são perdidos quando o processo do aplicativo é encerrado. Persistência local (Room ou DataStore) pode ser adicionada como próxima etapa.

## Abrir no Android Studio
1. Extraia o ZIP.
2. Abra a pasta `MeusGastos` (a pasta que contém `settings.gradle.kts`).
3. Aguarde a sincronização do Gradle.
4. Execute no emulador ou dispositivo Android.

O build não pôde ser validado neste ambiente porque o Gradle Wrapper precisou baixar o Gradle 9.6.0 e a conexão externa estava indisponível.
