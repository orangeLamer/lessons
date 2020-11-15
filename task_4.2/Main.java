public class Main {


        public static void main(String[] args) {

            // write your code here
            Dog just_dog = new Dog("Писайнога",4);
            
            just_dog.setName("Кусайнога");
            just_dog.setAge(7);
            System.out.println(just_dog.getName() +" / "+just_dog.getAge());

        }

        public static class Dog {
            private String name = ("Мухтар");
            private int age;
            Dog ( String name_1, int age_1){

                this.name=name_1;
                this.age = age_1;

            }
            String getName(){ return name;}

            void setName(String name2){ }

            int getAge(){ return age;}

            void setAge(int age2){ }
        }
}
