package student_app;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Сервис, содержащий инструменты по работе со студентами {@link Student}
 *
 * @author MegaCoder
 * @version 2.0.0
 */
public class StudentService {

    /**
     * Список студентов
     */
    private List<Student> students = new ArrayList<>();

    /**
     * Добавление студента в сервис
     *
     * @param student добавляемый студент
     */
    public void add(Student student) {
//        Student student1 = new Student(1, "");
//        Student student2 = new Student(2, "", 5);
        students.add(student);
    }

    /**
     * Получение студента по идентификатору
     *
     * @param id    идентификатор, по которому требуется найти студента
     * @return      студент с переданным идентификатором
     * @throws      NoSuchElementException в случае, если студент с заданным идентификатором не найден
     */
    public Student getById(int id) {
        List<Student> result = students.stream().filter(x -> x.getId() == id).limit(1).toList();
        if (result.isEmpty()) {
            throw new NoSuchElementException("Несуществующий идентификатор!");
        }
        return result.get(0);
    }
}