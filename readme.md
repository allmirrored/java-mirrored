### Java Template Repository

### compile

```shell
mvn compile
```

### clean

```shell
mvn clean
```

### test

```shell
mvn test
```

### reformat code

```shell
mvn spotless:apply
```

### check formatting

```shell
mvn spotless:check
```

## Як запустити перевірку завдань

У корені репозиторію виконайте:

```shell
mvn test spotless:check
```

Команда запускає тести рішень і перевіряє форматування Java-коду.
Успішний результат — `BUILD SUCCESS`, без помилок і пропущених тестів.
Рішення розміщені в `src/main/java/homework/hNN`, тести — у
`src/test/java/homework/hNN`.

## Вимоги до середовища

- JDK 25: перевірте `java -version` і `javac -version`.
- Maven 3.9.11 — версія, на якій перевірено проєкт; перевірте `mvn -version`.
- Maven має використовувати JDK 25; за потреби налаштуйте `JAVA_HOME`.
- Для першої збірки потрібен доступ до Maven Central, щоб завантажити
  публічні залежності й плагіни. Наступні збірки використовують локальний кеш.

## Автоматичні перевірки (CI)

GitHub Actions запускає workflow `ci` після push і для pull request у `master`.
Перевірка `Java 25 checks` використовує JDK 25, перевіряє наявність `readme.md`,
форматування та тести:

```shell
mvn --batch-mode --no-transfer-progress -Djqwik.database=target/jqwik-database spotless:check test
```

Форматування перевіряється перед тестами, оскільки Maven також автоматично
форматує джерела під час життєвого циклу збірки. Результат CI видно у вкладці
Checks відповідного PR та у вкладці Actions репозиторію.

