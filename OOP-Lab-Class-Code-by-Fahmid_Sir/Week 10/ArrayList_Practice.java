import java.util.*;


    class ArrayList_Practice {
        
        public static class point implements Comparable<point>
        {
        int x;
        int y;
        
        public int compareTo(point p2)
        {
            if(this.x > p2.x ) return 100;
            else if (this.x < p2.x ) return -100;
            else return 0;
        }
        
        point(int x,int b)
        {
            this.x = x;
            y = b;
        }
        
        void display()
        {
            System.out.println("x = "+x +" "+ "y = "+y);
        }
        
        @Override
        public String toString()
        {
            return "( X = "+x +" "+ "y = "+y+" ) ";
        }
        
        }
        
        public static void showList(ArrayList<point> p_list)
        {
            for(int i=0;i< p_list.size();i++)
            {
                System.out.println("x = "+p_list.get(i).x +" "+ "y = "+p_list.get(i).y);
            }
        }
    
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();
        
        al.add(new String("Cat"));
        al.add(new String("Dog"));
        al.add(new String("Bird"));
        
        al.set(1,new String("kitty"));
        al.set(1,new String("Puppy"));
        
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        
        if(al.contains("bird"))
        {
            System.out.println("Exist");
        }
        else
        {
            System.out.println("Not Exist");
        }
        
        point p1 = new point(2,3);
        p1.display();
        System.out.println("P1 : "+ p1);
        
        point p2 = new point(2,3);
        System.out.println("P2 : "+ p2);
        
        point p3 = p1;
        System.out.println("P2 : "+ p2);
        
        point p4 = new point(30,1);
        
        point p5 = new point(4,9);
        
        if(p1 == p2 )
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
         if(p1.x == p2.x && p1.y == p2.y )
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
        if(p1 == p3 )
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
        String s1 = new String("abc");
        String s2 = new String("abc");
        
        if(s1 == "admin" )
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
        if(s1.equals(s2) )
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
        System.out.println("before AL : "+ al);
        
        Collections.sort(al);
        
        System.out.println("after AL: "+ al);
        
        Collections.sort(al,Collections.reverseOrder());
        
        System.out.println("after AL: "+ al);
        
        ArrayList<point> pl = new ArrayList<>();
        
        pl.add(p1);
        pl.add(p4);
        pl.add(p2);
        pl.add(p3);
        pl.add(p5);
        
        System.out.println("before PL : "+ pl);
        showList(pl);
        
        Collections.sort(pl);
        System.out.println("after PL : "+ pl);
        
    }
}