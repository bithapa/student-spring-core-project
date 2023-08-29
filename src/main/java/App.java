import com.bikash.model.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App {
    public static void main(String[] args) {
        String pathToXML = "/Users/bikashthapa/IdeaProjects/Student/src/main/java/com/bikash/config/spring_config.xml";
        FileSystemResource resourceFile = new FileSystemResource(pathToXML);

        // create container
        BeanFactory factory = new XmlBeanFactory(resourceFile);

        Object object = factory.getBean("student");

        Student student = (Student)object;

        System.out.println("Number : " + student.getNumber() +
                "\nName: " + student.getName() +
                "\nAddress: " + student.getAddress());
    }
}
