public class outerclass {
        private class InnerClass {
            void display() {
                System.out.println("Hello from the private inner class!");
            }
        }
    
        public void showMessage() {
            InnerClass inner = new InnerClass();
            inner.display();
        }
    
        public static void main(String[] args) {
            OuterClass outer = new OuterClass();
            outer.showMessage();
        }
    
    
}
