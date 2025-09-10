package HEAPs;

// using hasp use lots of space and override. but it will gives
// answer in constant time.....
public class mapUsinghash
{
    private Entity[] entites;

    public mapUsinghash()
    {
        entites = new Entity[100];
    }

    private class Entity {
        String key;
        String val;

        public Entity(String key, String val) {
            this.key = key;
            this.val = val;
        }
    }

    public void put (String key, String val)
    {
        int hash = Math.abs(key.hashCode()% entites.length);

        entites[hash] = new Entity(key,val);
    }

    public String get (String key)
    {
        int hash = Math.abs(key.hashCode()% entites.length);

        if(entites[hash]!= null && entites[hash].key.equals(key)) return entites[hash].val;

        System.out.println(key+" is not found");
        return null;
    }
    public void remove (String key)
    {
        int hash = Math.abs(key.hashCode()% entites.length);

        if(entites[hash]!= null && entites[hash].key.equals(key))
        {
            entites[hash] = null;
            System.out.println("removing "+key+" is done");
            return;
        }

        System.out.println(key+"is not found");
    }
}
