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

