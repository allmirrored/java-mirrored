# Самостійна 12: стан

Умови Java і Git надані студентом 12 листопада 2026 року.
DevOps надано пізніше: транзитивні залежності, конфлікти версій,
dependency:analyze, перевірка оновлень, npm lock-файл і порівняння SHA-256.
Підготовлено окремий C:/Temp/dependency-lab-h12/demo з commons-lang3 3.14.0.
Основний pom.xml не змінено. Навчальні команди виконує студент.
T1 — 1051 Height Checker; T2 — 1122 Relative Sort Array.
Джерела: https://leetcode.com/problems/height-checker/ та
https://leetcode.com/problems/relative-sort-array/.

Рішення й 7 тестів додано. JDK 25: test spotless:check — BUILD SUCCESS;
187 тестів, Failures 0, Errors 0, Skipped 0.
T1 сортує копію, вхід не змінює: O(n log n), O(n) пам'яті.
T2 рахує значення 0..1000, видає спочатку порядок arr2, потім решту
за зростанням. O(n + m + K), O(n + K) пам'яті з результатом, K=1001.
Обидва вхідні масиви T2 зберігаються.

Git виконує студент у Git Bash. Спочатку перевіряємо наявні ключі;
існуючі ключі не перезаписуємо. У репозиторій не додаємо ключів чи токенів.
Після додавання публічного ключа: ssh-agent, ssh-add, ssh -T;
відбиток сервера звіряємо з GitHub Docs перед підтвердженням.
Remote переводимо на SSH після успішної перевірки, тоді fetch.
Далі gh auth login/status і окремий C:/Temp/secret-demo-h12
лише з явно несправжнім значенням TOKEN.

Git-трек завершено студентом, підтвердження git-1..git-6 у screenshots/h12.
Створено Ed25519-ключ, ssh -T підтвердив allmirrored; origin переведено на
git@github.com:allmirrored/java-mirrored.git, fetch завершився з кодом 0.
GitHub CLI авторизований через браузер, gh auth status: keyring, SSH.
У навчальному репозиторії .env видалено другим комітом, але git show HEAD~1:.env
показав вигаданий TOKEN=NOT_A_REAL_TOKEN_FOR_LESSON_12. Working tree clean.
Справжні ключі й токени не копіювалися в матеріали заняття.
DevOps завершено студентом; підтвердження devops-1..devops-7b у screenshots/h12.
Дерево httpclient5 5.3 показало httpcore5/httpcore5-h2 5.2.4 і slf4j-api 1.7.36.
Verbose і includes перевірено. Analyze показав очікувану unused httpclient5.
Замість некоректного дублювання прямих commons-lang3 виконано конфлікт
прямої httpcore5 5.2.3 і транзитивної 5.2.4; пряма перемогла. Після видалення
перевизначення дерево повернулось до 5.2.4 без version conflict.
Перевірено доступні оновлення, версії в POM не оновлювалися.
В окремій npm-пісочниці створено package-lock.json, npm ls: lodash 4.18.1.
Дві звичайні clean package дали різні SHA-256. Дві збірки з однаковим
-Dproject.build.outputTimestamp=2026-01-01T00:00:00Z дали однакові SHA-256,
comparison exit code 0. Це локальна перевірка, не доказ для всіх середовищ.
Навчальні POM, JAR і node_modules залишаються поза основним репозиторієм.
19 листопада 2026 збережено Accepted: T1 — 81/81, T2 — 18/18,
allmirrored, 19:04. Код на снимках відповідає рішенням у репозиторії.
Назви/номери задач і URL в кадри не потрапили; строгий G1 підтверджено не повністю.
19 листопада оновлено єдиний screenshots/leetcode-total.png: Total Solved 22,
Easy 22, Submissions 40. Розташування визначено критерієм G4; окремих
копій Total у hNN немає. Після наступних занять замінюємо цей самий файл.
Матеріали підготовлено до commit/push.
