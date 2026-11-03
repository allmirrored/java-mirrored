# Результаты проверки

Дата: 3 ноября 2026 года, Europe/Kiev. Проверен коммит `865032b`
ветки `repository-cleanup` в новой локальной копии, созданной командой
`git clone --no-hardlinks --branch repository-cleanup` из этого репозитория.
Незакоммиченные файлы рабочего каталога в копию не переносились.

Среда: Eclipse Temurin OpenJDK **25.0.5+8**, Apache Maven **3.9.11**, Windows x64.
Java/Maven скачаны как переносимые инструменты вне репозитория.
SHA-256 архива JDK проверен по метаданным Adoptium. Исходный `pom.xml`
не менялся. Путь к локальному Maven-кешу задан через `MAVEN_OPTS`.

| Команда из корня чистой копии | Результат | Протокол |
| --- | --- | --- |
| `mvn clean compile` | BUILD SUCCESS, exit 0 | [clean-compile.log](verification/clean-compile.log) |
| `mvn test-compile` | BUILD SUCCESS, exit 0 | [test-compile.log](verification/test-compile.log) |
| `mvn test` | BUILD SUCCESS, 118 тестов, Failures 0, Errors 0, Skipped 0 | [test.log](verification/test.log) |
| `mvn spotless:check` | BUILD SUCCESS, exit 0 | [spotless-check.log](verification/spotless-check.log) |

105 тестов относятся к домашним заданиям, 13 — к исходному шаблону.
Spotless проверил все 33 Java-файла. Дополнительно `git diff --check`
не обнаружил ошибок пробелов.

## Покрытие F2

На той же копии выполнено без изменения POM:

```shell
mvn org.jacoco:jacoco-maven-plugin:0.8.14:prepare-agent test org.jacoco:jacoco-maven-plugin:0.8.14:report
```

Результат: BUILD SUCCESS. JaCoCo 0.8.14 поддерживает Java 25,
см. [официальную историю версий](https://www.jacoco.org/jacoco/trunk/doc/changes.html).
Машинный отчёт: [jacoco.xml](verification/jacoco.xml).

| Класс | Покрытые ветви | Пропущенные ветви | Пропущенные строки |
| --- | --- | --- | --- |
| h01/T1 | 12 | 0 | 0 |
| h01/T2 | Нет условных ветвей в байткоде метода | 0 | 0 |
| h02/T1 | 10 | 0 | 0 |
| h02/T2 | 20 | 0 | 0 |
| h03/T1 | 12 | 0 | 0 |
| h03/T2 | 6 | 0 | 0 |
| h04/T1 | 4 | 0 | 0 |
| h04/T2 | 4 | 0 | 0 |
| h05/T1 | 4 | 0 | 0 |
| h05/T2 | 6 | 0 | 0 |
| h06/T1 | 8 | 0 | 0 |
| h06/T2 | 22 | 0 | 0 |
| h07/T1 | 8 | 0 | 0 |
| h07/T2 | 4 | 0 | 0 |

Итого для `homework`: 120 из 120 ветвей и 100% строк.
Покрытие не подтверждает, что URL соответствуют Classroom, и не заменяет
Accepted-скриншоты. Эти открытые пункты описаны в
[аудите критериев](repository-audit.md).

## Сохранность шаблона и структура

`git diff dc73f22 -- pom.xml .gitignore readme.md src/main/java/app
src/main/java/code src/test/java/app src/test/java/code` не показывает
изменений. В Git нет `target/`, `.idea/`, `.iml`, `.DS_Store`.
В `src` только `.java`, все исходники и тесты в `src/main` и `src/test`.
Имена отслеживаемых путей ASCII, без пробелов; каталоги в нижнем регистре.
История дополнена отдельными коммитами h01–h07, без reset/rebase/amend.

`mvn test` может заново создать `.jqwik-database` в корне из-за защищённых
шаблонных property-тестов. Этот служебный файл не нужно коммитить.
В рабочем репозитории он вынесен за пределы проекта; изменять `.gitignore`
для этого было запрещено.
