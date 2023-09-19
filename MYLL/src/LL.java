public class LL {
    Node head;
    Node tail;

    public LL(){
        head=null;
        tail=null;
    }

    public boolean isFull(){
        if(head==null){
            return false;
        }
        else{
            return  true;
        }
    }

    public  void  prepend(int data){
        Node nNode = new Node(data);
        if(isFull()){
            nNode.next=head;
            head=nNode;
        }
        else {
            head=nNode;
            tail=nNode;
        }
    }

    public  void  addTheEnd(int data){
        Node nNode= new Node(data);
        if(isFull()){
            tail.next=nNode;
            tail=nNode;

        }else {
            head=nNode;
            tail=nNode;
        }
    }

    public void insertToIndex(int data , int index){
        Node nNode = new Node(data);
        if(isFull()){
            if(index==0){
                nNode.next=head;
                head=nNode;
            }
            else
            {
                Node pointer1= null;
                Node pointer2=head;
                int nowIndex=0;
                while (pointer2!=null && nowIndex<index){
                    pointer1=pointer2;
                    pointer2=pointer2.next;
                    nowIndex++;
                }
                if(pointer2==null)
                {
                    tail.next=nNode;
                    tail=nNode;
                }
                else
                {
                    pointer1.next=nNode;
                    nNode.next=pointer2;
                }
            }
        }
        else{
            head=nNode;
            tail=nNode;
        }
    }

    public  void deleteFirst(){
        if (isFull()){
            if (head==tail){
                head=null;
                tail=null;
            }
            else {
                Node nHead= head.next;
                head.next=null;
                head=nHead;
            }
        }
    }

    public  void lastDelete(){
        if(isFull()){
            if(head==tail){
                head=null;
                tail=null;
            }
            else {
                Node pointer = head;
                while (pointer.next!=tail){
                    pointer=pointer.next;
                }
                pointer.next=null;
                tail=pointer;
            }
        }
    }

    public void deleteIndex(int index){

        if(isFull()){
            if(head==tail){//tek eleman
                head=null;
                tail=null;
            }
            else{//birden fazla eleman
                if(index==0){
                    Node nHead=  head.next;
                    head.next=null;
                    head=nHead;
                }
                else{//index sonda olabilir ortada
                    Node pointer1=null;
                    Node pointer2=head;
                    int nowIndex=0;
                    while (pointer2!=null && nowIndex<index){
                        pointer1=pointer2;
                        pointer2=pointer2.next;
                        nowIndex++;
                    }
                    if(pointer2!=null){
                        if(pointer2==tail){//sondan silme
                            pointer1.next=null;
                            tail=pointer1;
                        }
                        else {//ortadan silme
                            Node pointer3= pointer2.next;
                            pointer2.next=null;
                            pointer1.next=pointer3;
                        }
                    }
                }
            }
        }

    }

    public void show(){
         Node pointer=head;
         while (pointer!=null){
             System.out.print(pointer.data + " ");
             pointer=pointer.next;

        }
    }
}
