package Trees.BinaryTrees_Problem.DFS;

import Trees.BST_mark1_and_selfBalc;
import Trees.BinaryTrees_Problem.BFS.TreeNode;

public class Serialize_and_Deserialize_Binary_Tree
{

    public static void main(String[] args)
    {
        Serialize_and_Deserialize_Binary_Tree s = new Serialize_and_Deserialize_Binary_Tree();

        s.TestRun();
    }
    public void TestRun()
    {
        TreeNode root = new TreeNode(-2);
        root.left = new TreeNode(-1);
        root.left.left = new TreeNode(-44);
        root.left.right = new TreeNode(99);
        root.right = new TreeNode(-22);
        root.right.left = new TreeNode(-36);
        root.right.right = new TreeNode(7);

        Codec desc = new Codec();
        String str = desc.serialize(root);

        root = desc.deserialize(str);
        System.out.println(str);
    }

    public static void NiceDisplay(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        recurNiceprint(root,0);
    }

    private static void  recurNiceprint(TreeNode head, int level)
    {
        if(head == null)
        {
            return;
        }
        recurNiceprint(head.right,level+1);

        if(level != 0)
        {
            for (int i = 0; i < level-1; i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+head.val);
        }else
        {
            System.out.println(head.val);
        }
        recurNiceprint(head.left,level+1);

    }

    // mine too this code inspirited by random person from leetcode
    // i make it little optimize
    // important point i learned
     
    // * StringBuilder much faster then String (because String is immutable)

    // * we can share index in recursion by using array(Setting a value share
    // the reference any changes made also affect his original) and using a
    // common private int value(this one much better then array)

    // * to encode and decode int use shift the bit value and cast into char
    // this one faster than my first code because this will be you separate value
    // single Char for positive,negative and long range values
    // (char)(val >> 16) and (char) val - encode  (splitting value into two
    // 16 & 16 bits by right shifting ignore the last 16bit of 32 bits value
    // and cast to char and store and just casting a int value to char will store last 16 bits)
    // (val << 16) + val - decode; (by left shifting 16 give will gives 16 bits 0f zeros + adding
    // value second half of the original 32bit to the last 16 bits of zero will gives the original value)
    public class Codec {
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }
            StringBuilder str = new StringBuilder();

            str = serialize(root, str);
            return str.toString();
        }

        private StringBuilder serialize(TreeNode root, StringBuilder str) {
            if (root == null) {
                str.append("s");
                return str;
            }

            str.append((char) (root.val >> 16));
            str.append((char) root.val);

            str = serialize(root.left, str);
            str = serialize(root.right, str);

            return str;
        }

        private int index = 0;

        public TreeNode deserialize(String data) {
            if (data.isEmpty()) {
                return null;
            }

            char[] str = data.toCharArray();


            TreeNode root = deserialize(str);
            return root;
        }

        private TreeNode deserialize(char[] str) {
            if (str[index] == 's') {
                ++index;
                return null;
            }

            TreeNode node = new TreeNode();

            node.val = (str[index] << 16) + (str[index + 1]);
            index += 2;

            node.left = deserialize(str);
            node.right = deserialize(str);

            return node;
        }
    }


        // some random person code from leetcode
        // run time - 1ms & time complexity - O(n)
//        public String serialize(TreeNode root) {
//            if(root == null)
//                return "";
//            StringBuilder res = new StringBuilder();
//            serialHelper(root, res);
//            return res.toString();
//        }
//        private void serialHelper(TreeNode root, StringBuilder res){
//            if(root == null)
//                res.append('s');
//            else{
//                res.append('u');
//                res.append((char) (root.val >> 16));
//                res.append((char) root.val);
//                serialHelper(root.left, res);
//                serialHelper(root.right, res);
//            }
//        }
//        public TreeNode deserialize(String data) {
//            if(data == null || data.length() == 0)
//                return null;
//            char[] d = data.toCharArray();
//            int[] pointer = new int[1];
//            TreeNode res = new TreeNode((d[1]<<16)+d[2]);
//            pointer[0] = 3;
//            deserialHelper(res, d, pointer);
//            return res;
//        }
//        private void deserialHelper(TreeNode root, char[] d, int[] p){
//            if(p[0] < d.length && d[p[0]] == 'u'){
//                root.left = new TreeNode((d[p[0]+1]<<16) + d[p[0]+2]);
//                p[0]+=3;
//                deserialHelper(root.left, d, p);
//            }
//            else
//                p[0]++;
//            if(p[0] < d.length && d[p[0]] == 'u'){
//                root.right = new TreeNode((d[p[0]+1]<<16) + d[p[0]+2]);
//                p[0]+=3;
//                deserialHelper(root.right, d, p);
//            }
//            else
//                p[0]++;
//        }
    public class Codec_mine_01 {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root)
        {
            if(root == null)
            {
                return "N";
            }

            String str = new String();
            if(root.val < 0)
            {
                str = "m"+(root.val * -1)+"-"+serialize(root.left)+serialize(root.right);
            }
            else str = root.val+"-"+serialize(root.left)+serialize(root.right);

            return str;
        }

        // Decodes your encoded data to tree.

        private int index = 0;
        public TreeNode deserialize(String data)
        {
            char[] d = data.toCharArray();

            return deserialize(d);
        }

        private TreeNode deserialize(char[] data)
        {
            if(data.length <= index)
            {
                return null;
            }

            if(data[index] == 'N')
            {
                ++index;
                return null;
            }

            int ans  = 0;
            int type = 1;
            if(data[index]=='m')
            {
                type = 0;
                ++index;
            }
            while(data[index]!= '-' && data[index]!= 'N')
            {
                ans = (ans*10)+(data[index]-48);
                ++index;
            }

            if(data[index] == '-') ++index;

            TreeNode root = new TreeNode();
            if(type == 0)
            {
                root.val = type - ans;
            }else root.val = ans;
            root.left = deserialize(data);
            root.right = deserialize(data);

            return root;
        }
    }
}
