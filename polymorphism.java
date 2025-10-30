public class polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhaw bhaw");

        }
    }
        public static class cat{
            void speak(){
                System.out.println("meow meow");
    
            }
            public static class human{
                void speak(){
                    System.out.println("talk");
        
                }
            }
        }
        public static void main(String[] args){
            //creat object name as ram ,d ,c
            human ram=new human();
            Dog d=new Dog();
            cat c=new cat();

            ram.speak();
            d.speak();
            c.speak();
        }
}
