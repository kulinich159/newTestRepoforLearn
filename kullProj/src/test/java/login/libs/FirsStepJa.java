package login.libs;

import login.libs.Calc;
import login.libs.WorkWithArray;
import login.libs.currency.CanadianDollar;
import login.libs.currency.Dollar;
import login.libs.currency.Euro;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirsStepJa {
    public static void main(String[] args) {

       Logger logger = Logger.getLogger("FirstStepJa"); // вызов обьекта или екземпляра класа логера
        System.out.println("hi");

        int var1 = 3;
        int var2;
        var2 = 5;
        String varString1 = "ddd";
        String varString2 = "ddd1";


//        System.out.println(var1+var2);

        Calc.sum(var1, var2);

        int var3 = 5;
        int var4 = 6;

//        System.out.println(var3+var4);

        Calc.sum(var3, var4);
        Calc.sum(varString1, varString2);
        Calc.sum("asdasdas!!!", "2342asdasdsss");

        Calc.sum("Test", 3);
        int rez_1 = Calc.sum(var1, var3);
        String rez_2 = Calc.sum("String1", "String2");
        int rez_3 = Calc.sum(3, "33");


        System.out.println(Calc.sum(3, "3a3") + 3);

        int[] massiv = {2, 4, 26, 7, 28, 10, 9, 20, 33};
        System.out.println(massiv[2]);
        System.out.println(massiv.length);


        for (int i = 0; i < massiv.length; i++) {

            if (massiv[i] < 10) {

                System.out.println(massiv[i] + " Элемент меньше 10");

            } else if (massiv[i] == 10) {

                System.out.println(massiv[i] + " Элемент равен 10");

            } else if (massiv[i] > 10) {

                System.out.println(massiv[i] + " Элемент больше 10");

            } else {

                System.out.println("Элемент не подходит по критериям");
            }
        }

        System.out.println("----LOOP[][]----");
        //двомерный масив
        int[][] massivMassiv = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int[][] massivMassiv2 = new int[5][5];

        for (int i = 0; i < massivMassiv2.length; i++) {
            for (int j = 0; j < massivMassiv2[i].length; j++) {

                if (i == (massivMassiv2[i].length-1)-j) {
                    massivMassiv2[i][j] = 1;
                    System.out.print(massivMassiv2[i][j] + " ");

                } else {
                    massivMassiv2[i][j] = 0;
                    System.out.print(massivMassiv2[i][j] + " ");
                }

            }

            System.out.println();

        }


        System.out.println("----MATRIX----");

        WorkWithArray workWithArray = new WorkWithArray();

        workWithArray.createMatrix(6,6,7);


        System.out.println("----LIST----");

        List<String> ourList = new ArrayList<>();

        ourList.add("test");
        System.out.println(ourList);
        ourList.add("test1");
        System.out.println(ourList);
        System.out.println(ourList.get(1));
        System.out.println("Size = " + ourList.size());

        for (String element: ourList) {

            System.out.println(element);
        }


        System.out.println("----LIST OF LIST----");
        List<List<String>> ourListList = new ArrayList<>();
        System.out.println(ourListList);


        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);

        ourListList.get(1).add("test"); // добавляем значение в первый елемент
        System.out.println(ourListList);
        ourListList.get(1).add("test1"); // добавляем еще 1 значение в первый елемент
        System.out.println(ourListList);

        ourListList.get(1).remove(0); // удаляем  0 елемент в первой строке - это значение test)
        System.out.println(ourListList);


        System.out.println("----LIST OF LIST autofill----");

        List<String> lineList = new ArrayList<>();
        lineList.add("element1");
        lineList.add("element2");
        System.out.println(lineList);

//        ourListList.add(lineList); // - добавляет ссылку на область памяти где это хранится
        ourListList.add(new ArrayList<>());
        ourListList.get(2).addAll(lineList);
        System.out.println(ourListList);

        ourListList.get(1).addAll(0,lineList); // добавление в 1й елемент листа листов ourListList елементы lineList на позицию нулевого индекса
        System.out.println(ourListList);

        lineList.add("element3");
        ourListList.add(lineList);
        for (List<String> line: ourListList
        ) {

            System.out.println(line);

        }

        System.out.println("----ПАРА КЛЮЧ ЗНАЧЕНИЕ----");

        // часто используется для работы с БД
        Map<String, Integer> ourMap = new HashMap<>();
        ourMap.put("login", 23);
        System.out.println(ourMap);
        ourMap.put("Pass", 543);
        System.out.println(ourMap);
        System.out.println(ourMap.get("Pass"));  //вывод значения по ключу (происходит доступ к елементу по ключу)
        ourMap.put("Pass", 777); // ечли еще раз задать значение для указаного ключа - перезапишется
        System.out.println(ourMap);
        System.out.println("Map size = " + ourMap.size());

        // создаем список мапок
        List<Map<String,Integer>> ourListMap = new ArrayList<>();
        ourListMap.add(new HashMap<>()); //добавление новой строки (это как 0 элемент) в которую дальше добавляем пары ключ значение
        ourListMap.get(0).put("Login", 23);
        ourListMap.get(0).put("pass", 777);
        ourListMap.get(0).put("pass1", 778);
        System.out.println(ourListMap);
        System.out.println(ourListMap.get(0).get("pass1")); // получаем доступ до значения по ключу

        ourListMap.add(new HashMap<>()); //добавление новой строки (это как 1 элемент) в который дальше добавляем пары ключ значение
        ourListMap.get(1).put("login",24);
        ourListMap.get(1).put("pass",654);
        ourListMap.get(1).put("pass1",655);
        System.out.println(ourListMap);


        for (int i = 0; i < ourListMap.size() ; i++) {

            System.out.println("Line " +(i+1) + " pass = " + ourListMap.get(i).get("pass"));


        }


        System.out.println("----CREATE SOME CURRENCY----");

        Dollar dollar = new Dollar(28);
        // Гетером мы получаем курс
        System.out.println("Dollar currency = " + dollar.getKursNBU());
        // Cетером мы задаем курс
        dollar.setKursNBU(28.5);
        System.out.println("Dollar currency = " + dollar.getKursNBU());;

        dollar.exchangedCurrencyToGrn(100);
        dollar.setKursNBU(29);
        dollar.exchangedCurrencyToGrn(100);

        Euro euro = new Euro(30);
        System.out.println("Euro currency = " + euro.getKursNBU());
        euro.setKursNBU(32);
        euro.exchangedCurrencyToGrn(100);
        //System.out.println(euro.exchangedCurrencyToGrn(100));

        CanadianDollar canadianDollar = new CanadianDollar(18);
        canadianDollar.exchangedCurrencyToGrn(100);
        System.out.println(dollar.isfreeConv());
//
//        // чтоб начать работать с какой-то сруктурой или чем-то еще нужно
//        1. .jar - найти файл архив библиотеки
//        2. .property - укзаить настройки для этой библиотеки
//        3. [Class]    - (опционально) создание определенного  класа для того чтоб дергать ту библеотеку которую установили
//

//        logger.info("-Info-");
//        logger.debug("-Debug-");
//        logger.error("-Error-");



//          pull - копируем себе репозиторий (c remoutemaster на localmaster)
//          создаем свою ветку под конкретную задачу (1 задача = 1 ветка)
//          commit - Отправляем изменения на local branch который создаем
//          еще раз pull перед тем как отправить свои изменения на remoutemaster стягиваем те данные что были себе - ?
//          push своих изменений
//          pull request \marg request создаем запрос на ревью кем-то  (он после апрува мержит в мастер)
//          локальная ветка что была до этого - удаляется
//   для работы с гитом создаем папку , дальше на папке нажимаем git bash here  = >  в повившемся окне вводим git init (это команда следи за этой пакой)
//       дальше копируем с гита проект git clone https://github.com/SeleniumQALight/G38Project.git(ссылка на ресурс проета на гите)


        System.out.println("----END----");




    }
}
