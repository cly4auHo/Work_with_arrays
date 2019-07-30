package hz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WorkWithList {

//    public static void main(String[] args) {
//        ArrayList<Client> clients = new ArrayList<>();
//
//        clients.add(new Client("Ivan Pizdorvan", 9, true));
//        clients.add(new Client("Gosha Kucenko", 17, true));
//        clients.add(new Client("Ivan Gamaz", 11, false));
//        clients.add(new Client("Yuriy Khovansky", 154, true));
//        clients.add(new Client("Dyadya Petya", 123, false));
//        clients.add(new Client("Nikolay Baskov", 69, true));
//        clients.add(new Client("Philipp Kirkorov", 0, true));
//
//        forEach(clients, c -> c.setSum(c.getSum() - 2));
//        print(map(clients, Client::getName));
//        print(clients);
//        print(filter(clients, c -> c.isActive()));
//        print(filter(clients, Client::isActive)); //эквивалентно
//        print(fold(clients, 0, (client, sum) -> client.getSum() + sum));
//        print(find(client, c -> c.getName().startWith("Ivan")));
//    }
//
//    public static void print(Collection items) {
//        for (Object item : items) {
//            System.out.println(item.toString());
//        }
//    }
//
//    public static void print(Object item) {
//        System.out.println(item.toString());
//    }
//
//    public static <X> void forEach(List<X> list, Action1<X> action1) {
//        for (X item : list) {
//            action1.apply(item);
//        }
//    }
//
//    public static <X, Y> List<Y> map(List<X> list, Func1<X, Y> mapFunction) { // отображение 
//        ArrayList<Y> result = new ArrayList<>();
//
//        for (X item : list) {
//            result.add(mapFunction.apply(item));
//        }
//        return result;
//    }
//
//    public static <X> List<X> filter(List<X> list, Func1<X, Boolean> filterFunction) {
//        ArrayList<X> result = new ArrayList<>();
//
//        for (X item : list) {
//            if (filterFunction.apply(item)) {
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//    public static <X> X find(List<X> list, Func1<X, Boolean> findFunction) {
//        for (X item : list) {
//            if (findFunction.apply(item)) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//    public static <X, Y> Y fold(List<X> list, Y intValue, Func2<X, Y, Y> foldFunction) {
//        Y result = intValue;
////свертка, например найти сумму у всех 
//        for (X item : list) {
//            result = foldFunction.apply(item, result);
//        }
//        return result;
//    }
}
