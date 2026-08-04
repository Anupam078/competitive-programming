import java.lang.classfile.components.ClassPrinter.ListNode;

public class linkedList {
    
ListNode counter=head;
int count=0;

while(counter.next!=null){

count++;

counter=counter.next;

}

ListNode current=head;

ListNode dummy=current;


if(count%2!=0){

while(dummy.next!=null){

current=current.next;

dummy=dummy.next.next;

}
return current.val;
}
else{
    while(dummy!=null){
        current=current.next;

        dummy=dummy.next.next;
    }
    return current.val;
}
}
