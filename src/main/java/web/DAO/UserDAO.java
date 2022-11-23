package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDAO {
    private static int USER_COUNT;
    private List<User> userList;



        {
        userList = new ArrayList<>();
        userList.add(new User(++USER_COUNT, "Tom", "Jerry", 5));
        userList.add(new User(++USER_COUNT, "Ann", "Petrova", 18));
        userList.add(new User(++USER_COUNT, "Лада", "Анфисова", 20));
        userList.add(new User(++USER_COUNT, "Petr", "Сидоров", 88));
        userList.add(new User(++USER_COUNT, "Иван", "Жуков", 12));
    }

    public List<User> allUserDAO() {
        return userList;
    }
        public User showById(int id){
            return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
        }

        public void save(User user){
            user.setId(++USER_COUNT);
            userList.add(user);
        }
}