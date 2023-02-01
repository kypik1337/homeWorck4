import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class homeWorck4 {
    public static void main(String[] args) {
       ex3();
    }
    static void ex3 (){
        //Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random Random = new Random();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int randomItem = 0;
            randomItem = Random.nextInt(0, 10);
            linkedList.add(randomItem);
            sum = sum + randomItem;
        }
        System.out.println(linkedList);
        System.out.println("summa Item = " + sum);
    }
    static void enqueue(LinkedList<Integer> list){
        Random random = new Random();
        list.add(random.nextInt(0, 17));
    
    
    }
    static int dequeue(LinkedList<Integer> list){
        int number = 0;
        list.add(0);
        list.remove(0);
        return number;
    }
    static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
    static void ex2(){
        // Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
        // dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random Random = new Random();
        for (int i = 0; i < 5; i++) {
            linkedList.add(Random.nextInt(0, 10));
        }
        System.out.println(linkedList);
        enqueue(linkedList);
        System.out.println("enqueue " + linkedList);
        System.out.println("dequeue " + dequeue(linkedList));
        System.out.println("delete " + linkedList);
        
        System.out.printf("Первый элемент списка %s \n", first(linkedList));
        System.out.printf("Полный список %s ", linkedList);

    }
    
    static void ex1(){
        //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    LinkedList<Integer> linkedList = new LinkedList<Integer>();   
    linkedList.add(0);
    linkedList.add(3);
    linkedList.add(7);
    System.out.println("исходный " + linkedList);
    System.out.println("и реверс эфект " + revers(linkedList));
    }
    static LinkedList<Integer> revers(LinkedList<Integer> linkedList){
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (Integer integer : linkedList) {
            result.addFirst(integer);
        }
        return result;
        
    }
 
    
    
    
}
