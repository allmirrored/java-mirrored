# Самостійна 14: стан і план

Умови отримані 19 листопада 2026. DevOps прочитано з вкладення викладача.
T1 — 1047 Remove All Adjacent Duplicates In String: стек символів, O(n)/O(n).
T2 — 232 Implement Queue using Stacks: два стеки, амортизовано O(1) на операцію,
O(n) пам'яті; переносимо incoming лише коли outgoing порожній.
На LeetCode T1 перейменувати на Solution, T2 і конструктор на MyQueue.
Наявні локальні рішення й лабораторні джерела збережено; приклади T1 розділено
на окремі тести, T2 доповнено перевіркою 1/9 та рівно 100 викликів.

DevOps: extra/labs/h14/demo та consumer — навчальні вихідні файли.
Основні pom.xml, .gitignore, app/code не змінюємо. Для package/install
використовуємо ізольований C:/Temp/publish-lab-h14/repository, щоб початковий
стан кешу не залежав від минулих вправ. Тільки навчальний install навмисно
перезапише 1.0.0; це демонстрація проблеми, не правило публікації релізів.
Фінальний JAR 1.1.0 публікуємо GitHub Release після перевірки координат,
тегу/коміту та відсутності наявного релізу; артефакт не комітимо.
Release asset не є Maven registry: consumer не завантажить його за координатами
з GitHub Releases без додаткової конфігурації.

Git 1–5: окрема C:/Temp/stash-demo-h14, init -b main, локальна ідентичність.
В умові origin не створено, тому fetch origin у цій пісочниці непридатний;
локальний rebase main достатній. Конфлікт add/add розв'язуємо явно,
rebase --continue і --abort перевіряємо в окремих спробах.
Git 6: PR №13 вже слито й гілку видалено; створимо новий навчальний PR.
Rebase і force-with-lease застосовуємо лише до власної навчальної гілки,
ніколи до master чи спільної історії. Master залишається захищеним.

JDK 25: test spotless:check — BUILD SUCCESS, 210 тестів, 0 failures/errors/skipped.
DevOps виконано студентом: package без install, локальний install,
consumer dependency:tree, початковий вивід яісрукер, перезапис навчальної
1.0.0 дав ЯІСРУКЕР без перебудови consumer, install нової 1.1.0,
effective-pom і GitHub Release підтверджено снимками devops-1..7b.
Вихідні файли лабораторії: коміт 22e301e, гілка codex/h14.
Реліз: https://github.com/allmirrored/java-mirrored/releases/tag/v1.1.0,
asset demo-1.1.0.jar; target коміту джерел задавався явно.
Реліз і його тег надалі не переписуємо, rebase виконуємо на іншій гілці.
Git 1–5 виконано: stash push/pop, розходження main/feature, rebase зі зміною
хешу, add/add конфлікт, abort, повторне ручне рішення і continue, cherry-pick
hotfix: e4ab9e0 скопійовано у feature як 10c40e6.
Git 6 виконано у clone C:/Temp/pr-rebase-h14, особиста codex/h14-rebase-demo.
PR №3 створено з 11dde78. PR №4 включив джерела бібліотеки в master,
origin/master став 643468d. Rebase змінив коміт PR №3 на 626ff5d;
звичайний push відхилено non-fast-forward, force-with-lease успішний.
Master і тег релізу не переписували. Підтвердження git-1a..git-6c.
PR №3 успішно squash-merged, основна папка codex/h14 синхронізована
fast-forward до a162a61. Підтвердження git-7-merged-and-synced.png.
19 листопада 2026, 22:09 збережено Accepted allmirrored: T1 106/106,
T2 23/23. Номер/назва задач і URL у кадри не потрапили: строгий G1
підтверджено частково; статус, користувач і дата видимі.
Єдиний screenshots/leetcode-total.png оновлено: Total Solved 26,
Easy 26, Submissions 44. Копій Total у hNN немає.
Залишилась доставка рішень, тестів і підтверджень h14 через PR у master.
