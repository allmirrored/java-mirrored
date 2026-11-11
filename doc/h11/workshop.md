# Самостійна 11: план роботи

Джерело: текст Classroom від студента 11 листопада 2026 року.
T1 — 268 Missing Number, T2 — 169 Majority Element.
Код: homework/h11, тестовий пакет такий самий. Скриншоти: screenshots/h11.
Усі нові матеріали зберігатимуться окремим коммітом h11 в тому самому Git.

## DevOps: залежності

Підготовлено копію попереднього demo у C:/Temp/dependency-lab-h11/demo:
тільки pom.xml і src/main/java/Main.java, без target і вкладеної .git.
Основні pom.xml, .gitignore та app/code не змінюються.
Навчальні команди виконує студент, помічник лише підготував файли.

1. Підключити інструменти через source /c/gethub/java-template/doc/h07/environment.sh.
   Перейти за явним /c/Temp шляхом. cat pom.xml і dependency:tree без залежностей.
2. Додати org.apache.commons:commons-lang3:3.14.0 тільки в навчальний POM;
   dependency:resolve, dependency:tree. Фіксована версія — з умови заняття.
3. Застосувати StringUtils.reverse та isBlank у навчальному Main.java,
   compile/package, запуск із класами і бібліотекою в classpath.
   У Windows нативна java використовує крапку з комою між елементами classpath.
   Для кирилиці — -Dstdout.encoding=UTF-8 і передавання через cat.
4. Показати кеш за координатами. У вправі використовуємо
   -Dmaven.repo.local=C:/Temp/dependency-lab-h11/repository для кожного mvn,
   щоб не торкатися кешу основних збірок. Звичайне розташування без
   перевизначення — ~/.m2/repository; це зміна місця, а не механізму кешу.
5. Повторити resolve, прибрати лише каталог версії commons-lang3/3.14.0
   із навчального кешу (або перемістити поза repository), повторити завантаження.
   Не видаляємо весь org/apache/commons із користувацького ~/.m2.
   Maven -o перевіряє offline без вимикання мережі на всьому комп'ютері.
6. dependency:get com.google.code.gson:gson:2.10.1, перевірити кеш і незмінне
   дерево залежностей demo. Завантаження в кеш не додає залежність у POM.
7. Виконано в окремій Gradle-пісочниці: Gradle 9.2.1, JDK 25,
   gradlew dependencies --configuration runtimeClasspath показав commons-lang3.
   Підтвердження: devops-7-gradle-dependencies.png.

Повторне завантаження вимагає доступу до Maven Central, навіть якщо
основний проєкт уже збирався: новий навчальний кеш спочатку порожній.

## Git: конфлікти

Окрема песочниця C:/Temp/conflict-demo-h11, git init -b main.
Ідентичність автора локально — із останнього комміта основного проєкту.
Перед кожним merge перевіряємо чистий working tree.

1. Базовий config.txt з версією 1; dev змінює на 2, main на 99; merge dev.
2. status, cat config.txt: unmerged paths і три типи маркерів конфлікту.
3. merge --abort; dev додає notes.txt; повторний merge: конфлікт лише
   в config.txt, notes.txt додається автоматично.
4. Ручне рішення версія 100, add config.txt, status, merge --continue.
   Якщо відкриється редактор — пояснюємо збереження повідомлення комміта.
5. Після успішного merge просте повторення merge dev вже не створить
   конфлікту. Спочатку окремо створюємо нові суперечливі правки main/dev
   з чистого стану, а тоді merge. У новому конфлікті checkout --ours і
   --theirs показують сторони; ці команди самі по собі не знімають unmerged.
6. merge --abort, status, граф: повернення до стану перед останньою спробою.

Ours/theirs пояснюються саме в контексті merge main <- dev.
Навчальні конфлікти, комміти й скасування не виконуються в основному проєкті.
