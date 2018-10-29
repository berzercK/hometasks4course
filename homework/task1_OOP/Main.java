package education.homework.task1_OOP;

import education.homework.task1_OOP.book.Author;
import education.homework.task1_OOP.book.Book;
import education.homework.task1_OOP.employee.Employee;
import education.homework.task1_OOP.evclidGeometry.MyTriangle;
import education.homework.task1_OOP.figure.Circle;
import education.homework.task1_OOP.figure.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println(circle.toString());         // --> Circle[radius = 1.0, color = red]
        System.out.format("%.3f%n", circle.getArea()); // --> 3.142
        System.out.println(circle.getArea());          // --> 3.141592653589793
        System.out.println(circle.toString());
//----------------------------Rectangle----------------------------------------------
        Rectangle rectangle1 = new Rectangle(2.0f, 4.5f);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getLenght());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.toString());

        rectangle1.setLenght(3.0f);
        rectangle1.setWidth(6.0f);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.toString());

//---------------------------Triangle------------------------------------------------
        MyTriangle tr1 = new MyTriangle(0, 0, 2, 4, 4, 0);
        MyTriangle tr2 = new MyTriangle(0, 0, 2, 4, 4, 0);
        System.out.println(tr1.toString());
        System.out.println("Type = " + tr1.getType());
//        System.out.println("Perimeter = " + tr1.getPerimeter());
        System.out.print("Perimeter = ");
        System.out.format("%.3f%n", tr1.getPerimeter());

//----------------------------Book----------------------------------------------
        Author author1 = new Author("Pushkin", "as_pushkin@lol.roos", 'm');
        Author author2 = new Author("Lermontov", "lermont@lol.roos", 'm');
        Author author3 = new Author("Tolstoy", "soFat@lol.roos", 'm');
        Author author4 = new Author("Ahmatova", "ahmad@lol.roos", 'w');

        Author[] authors = new Author[]{author1, author2, author4};
        Book book1 = new Book("Tales", authors, 1200.0);
        System.out.println(book1.toString());
        System.out.println("Author name: " + book1.getAuthorNames() + "\nBook: " + book1.getName());


        Author[] authors2 = new Author[]{author3};
        Book book2 = new Book("War and world", authors2, 2000.0);
        System.out.println();
        System.out.println(book2.toString());

        System.out.println("Author name: " + book2.getAuthorNames() + "\nBook: " + book2.getName());
        System.out.println();


//----------------------------Employee----------------------------------------------
        int id = 0;
        Employee employee1 = new Employee(id++, 300, "Lex", "Luthor");
        Employee employee2 = new Employee(id++, 40, "Clark", "Kent");
        Employee employee3 = new Employee(id++, 100, "Steve", "Jobs");

        System.out.println(employee1.toString());
        System.out.println("Annual salary: " + employee1.getAnnualSalary());
        employee1.setSalary(employee1.raiseSalary(50));
        System.out.println("[UPDATE]" + '\n' + employee1.toString());
        System.out.println("Annual salary: " + employee1.getAnnualSalary());
        System.out.println();

        System.out.println(employee2.toString());
        System.out.println("Annual salary: " + employee2.getAnnualSalary());
        System.out.println();

        System.out.println(employee3.toString());
        System.out.println("Annual salary: " + employee3.getAnnualSalary());
        System.out.println();

    }
}

// System.out.format ("%.3f%n", d);
