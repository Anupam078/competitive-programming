public class LinkedList01{

    private node head;
    private node tail;
    private int size=0;
    public LinkedList01(){
        this.size=0;
    }

    public node getHead() {
        return head;
    }

    public void setHead(node head) {
        this.head = head;
    }

    public node getTail() {
        return tail;
    }

    public void setTail(node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertAtFirst(int val){
        node n=new node(val);
        n.next=head;
        head=n;
        if(head.next==null){
            tail=head;
        }
        size++;
    }

    public void displayList(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }

    public void insertAtLast(int val){
        node n=new node(val);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        tail=n;
        n.next=null;
        size++;
    }

    public void insertAtAnyIndex(int val,int index){
        node n = new node(val);
        int count=0;
        node temp=head;
        while(count==index+1 && temp.next!=null){
            temp.next=n;
        }
    }

    public class node{
        private int val;
        private node next;

        public node(int val){
            this.val=val;
        }

        public node(int val,node next){
            this.val=val;
            this.next=next;
        }
    }
}