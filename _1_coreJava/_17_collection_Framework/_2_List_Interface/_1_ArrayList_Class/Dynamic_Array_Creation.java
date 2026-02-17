package _1_coreJava._17_collection_Framework._2_List_Interface._1_ArrayList_Class;

public class Dynamic_Array_Creation {

    public static void main(String[] args){


        class DynamicArray{

            private Object[] oldArray;
            private  int intitialCapacity = 10;
            private int size = 0;

            DynamicArray(){
                oldArray = new Object[intitialCapacity];
            }

            DynamicArray(int capacity){
                if( capacity > 0){
                    this.intitialCapacity = capacity;
                }
                oldArray = new Object[intitialCapacity];
            }

            public void add(Object item) {

                if (intitialCapacity == size) {
                    //create new array with size 1.5 more than old array
                    this.intitialCapacity = (int) (this.intitialCapacity * 1.5 + 1);
                    // copy array element inoto new array

                    //like creating another array -- int[] arr = new arr[initialCapacity];
                    Object[] newArray = new Object[intitialCapacity];

                    for (int index = 0; index < oldArray.length; index++) {
                        newArray[index] = oldArray[index];
                    }
                    oldArray = newArray;
                }

                oldArray[size++] = item;

            }

            // if we create String method using String then it print null for unfill capacity bcoz of this we use Sb

//            @Override
//            public String toString() {
//                return "DynamicArray{" +
//                        "oldArray=" + Arrays.toString(oldArray) +
//                        ", intitialCapacity=" + intitialCapacity +
//                        ", size=" + size +
//                        '}';
//            }


            @Override    // write this beacuse toString() is not override by Arrays
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (int index = 0; index < size; index++) {
                    sb.append(oldArray[index]);
                    sb.append(",");
                }
                sb.append("]");

                return sb.toString();
            }


        }

        DynamicArray container = new DynamicArray();
        container.add(10);
        container.add("Vaishnavi");
        container.add(10.0F);
        container.add(true);
        container.add('C');
        container.add(-126);
        container.add(1000.00D);
        container.add("Snehal");
        container.add("Sakshi");
        container.add(10.00);
        container.add(1000.00d);
        System.out.println(container);
    }
}
