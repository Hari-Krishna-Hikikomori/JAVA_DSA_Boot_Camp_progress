package HEAPs;


import java.util.ArrayList;
import java.util.LinkedList;

public class mapUsing_list
{
    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public mapUsing_list()
    {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add(new LinkedList<Entity>());
        }

    }

    private class Entity
    {
        String key;
        String val;

        public Entity(String key , String val)
        {
            this.key = key;
            this.val = val;
        }
    }

    public void set (String key, String val)
    {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

    /*   for (int i = 0; i < entities.size(); i++) {
            Entity entity = entities.get(i);
            // code using entity
        }  */

        for (Entity entity : entities)                   // check if this hash already have value or not
        {
            if(entity.key.equals(key))
            {
                entity.val = val;
            }
        }

        if((float)(size) / list.size() > lf)
        {
            reHash();
        }

        entities.add(new Entity(key, val));
        size++;
    }

    public String get(String key)
    {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities)                   // check if this hash already have value or not
        {
            if(entity.key.equals(key))
            {
                return entity.val;
            }
        }

        System.out.println("Key not found");
        return null;
    }

    public void remove (String key)
    {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        Entity target;
        for (Entity entity : entities)                   // check if this hash already have value or not
        {
            if(entity.key.equals(key))
            {
                System.out.println("key remove successfully");
                size--;
                entities.remove(entity);
                return;
            }
        }

        System.out.println("key not found");
    }

    private void reHash()
    {
        ArrayList<LinkedList<Entity>> old = list;

        list = new ArrayList<>();

        for (int i = 0; i < old.size() * 2 ; i++)
        {
            list.add(new LinkedList<>());
        }

        size = 0;
        for(LinkedList<Entity> entries : old)
        {
            for(Entity entry : entries)
            {
                set(entry.key,entry.val);
            }
        }


    }



}
