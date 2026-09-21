# RPG Game Factory Project

Проект демонстрирует реализацию паттернов проектирования Factory Method и Abstract Factory на языке Java 17 для учебного задания (Assignment #2).

## Структура проекта
* `com.game.factorymethod` — Реализация паттерна "Фабричный метод" для создания героев (Warrior, Mage).
* `com.game.abstractfactory` — Реализация паттерна "Абстрактная фабрика" для создания комплектов снаряжения по фракциям (Орки, Эльфы).
* `com.game.main` — Точка входа в приложение.

## Инструкция по запуску
1. Скомпилируйте проект из корневой директории:
   ```powershell
   javac -d bin src/com/game/factorymethod/*.java src/com/game/abstractfactory/*.java src/com/game/main/*.java
   ```
2. Запустите приложение:
   ```powershell
   java -cp bin com.game.main.Main
   ```

## Дополнительная информация
Полный отчет по заданию находится в файле `REPORT.md`.