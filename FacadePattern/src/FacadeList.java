public class FacadeList {
    public static void facedeClien(){
        ListPrinter.printList(ListFilter.filterOdd(RandomList.generateList()));
    }

    static void main(String[] args) {
        facedeClien();
    }
}
