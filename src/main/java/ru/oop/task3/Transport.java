package ru.oop.task3;

/**
 * Транспорт
 */
public interface Transport extends Positioned {
    /**
     * Получить текущую позицию транспорта
     * @return
     */
    @Override
    Position getPosition();

    /**
     * Изменяет собственную позицию и позицию челоека.
     * Конечная позиция человека - максимально возможная позиция, до которой можно доехать на транспорте.
     * @param person
     * @param destination
     */
    void go(Person person, Position destination);
}
