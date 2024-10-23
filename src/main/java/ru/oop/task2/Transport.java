package ru.oop.task2;

/**
 * Трансопрт
 */
public interface Transport extends Positioned{

    /**
     * Получить текущую позицию транспорта
     * @return
     */
    @Override
    Position getPosition();

    /**
     * Изменяет собственную позицию и позицию человека во время езды на транспорте.
     * Конечная позиция человека - максимально возможная позиция, до которой можно доехать на транспорте.
     * @param person
     * @param destintation
     */
    void go(Person person, Position destintation);
}