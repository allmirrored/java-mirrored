# Самостійна 13: стан і план

Умови надані студентом 19 листопада 2026 року.
T1 — 278 First Bad Version; T2 — 2529 Maximum Count of Positive Integer and Negative Integer.
Обидва рішення використовують бінарний пошук: O(log n), O(1) додаткової пам'яті.
T1 локально абстрактний: API isBadVersion підміняється в тестах; на LeetCode
клас Solution extends VersionControl, абстрактну декларацію не вставляємо.
Тести перевіряють приклади окремо, межі, переповнення midpoint і число API-викликів.
JDK 25: test spotless:check — BUILD SUCCESS, 201 тест, 0 failures/errors/skipped.

DevOps: каталоги Central, контрольна сума, dependency:get, effective-settings,
npm/Python registry, перевірка доступу GitHub Packages, публічність залежностей POM.
Секрети та навіть префікси токенів на скриншотах не показуємо.
Для Maven registry GitHub потрібні відповідний токен і read:packages;
звичайний gh OAuth-токен не гарантує доступу. Зміна HTTP-коду сама по собі
не доводить доступу до реального артефакту. Не вигадуємо успішного завантаження.

Git: основна віддалена гілка master; README у репозиторії називається readme.md.
Навчальний PR створюємо в цьому репозиторії, з окремої гілки codex/.
Комітимо конкретні файли, не git commit -am, щоб не захопити сторонні зміни.
Коментар однокурсника/другого акаунта і чужий PR потребують реального учасника;
власний коментар не видаємо за незалежний review.
Fork/PR у чужий репозиторій вибираємо осмислено, не надсилаємо порожні правки
вчителю. Захист master має застосовуватися до адміністратора для тесту відмови.
Не виконуємо reset --hard у робочій теці з непідготовленими матеріалами.

DevOps 1–5 підтверджено: список Central, однакові SHA-1 commons-lang3,
Gson у кеші, effective-settings без користувацького settings.xml,
npm registry/метадані та pip config (порожні користувацькі налаштування).
Для pip підготовлено переносний pip поза репозиторієм.
Пункт 6: корінь maven.pkg.github.com/allmirrored/java-mirrored/ повернув
404 без credentials і 404 з Bearer OAuth-токеном gh. Токен не виводили.
Це не підтвердження завантаження приватного пакета: потрібні реальний
артефакт, підтримуваний токен і read:packages. Пункт має це обмеження.
Пункт 7: dependency:tree успішний, у POM немає repositories/pluginRepositories
чи приватних URL; залежності тестування публічні. Для збірки потрібні JDK 25,
Maven і доступ до Central або заповнений кеш.
Git: власний PR https://github.com/allmirrored/java-mirrored/pull/1 створено
з codex/h13-readme у master. Автор опублікував коментар до файлу; вимоги
Java/Maven додано другим комітом. Це не незалежний построковий review.
gh pr checkout перевірено на власному PR; чужий PR ще не перевірено.
Захист master створено, пробний прямий push з окремого clone відхилено
protected branch hook declined. Пробний локальний коміт прибрано лише там.
Fork allmirrored/aop-practice-s1-java-F5-on: origin/upstream підтверджено,
гілка з документацією JDK 25 відправлена, PR у вихідний репозиторій створено:
https://github.com/djnzx/aop-practice-s1-java-F5-on/pull/2.
Власний PR №1 успішно squash-merged; локальну й віддалену codex/h13-readme
видалено. Спочатку заважало обов'язкове approval=1; його вимкнено, вимога PR
і заборона bypass залишені. Автоматичних checks для PR не налаштовано.
Непідтверджені пункти Git: незалежний построковий review і checkout чужого PR.
Синхронізацію підтверджено: repository-cleanup та origin/master на 988edcd.
19 листопада 2026, 20:04 збережено Accepted allmirrored: T1 24/24, T2 169/169.
URL, номер і назва задач у кадри не потрапили; строгий G1 підтверджено частково.
Єдиний screenshots/leetcode-total.png оновлено 19 листопада: Total Solved 24,
Easy 24, Submissions 42. Копій Total у hNN немає.
Матеріали готові до доставки через PR; повну відповідність усім критеріям
не заявлено через перелічені обмеження Git, DevOps 6 і G1.
Матеріали h13 закомічено, відправлено й інтегровано через PR №2:
https://github.com/allmirrored/java-mirrored/pull/2.
Коміт у master: 708be19d76ee228bc433b5a9a7045403754f2cfb.
19 листопада 2026 повторно перевірено через SSH: віддалений master
містить цей коміт. Повторний запуск Maven test spotless:check з JDK 25
і локальним кешем завершився BUILD SUCCESS: 201 тест, 0 failures/errors/skipped.
Для h13 виконано 14 тестів. Зазначені вище обмеження доказів залишаються.
