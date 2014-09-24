package main.java.firing;

import main.java.tree.Tree;

import java.util.ArrayList;

public class firing {

    public static Tree<String> toyTree() {
        Tree<String> node0 = new Tree<String>("Jim", 500);
        {
            Tree<String> node1 = node0.addChild("Garfunkel", 1);
            Tree<String> node2 = node0.addChild("Simon", 10000);
            {
                Tree<String> node3 = node2.addChild("Peter", 100);
                {
                    Tree<String> node6 = node3.addChild("George", 1);
                    {
                        Tree<String> node7 = node6.addChild("Nephew", 100);
                    }
                }
                Tree<String> node4 = node2.addChild("Mary", 100);
                {
                    Tree<String> node5 = node4.addChild("Rosemary", 1);
                }
            }
        }
        return node0;
    }

    public static int maxValue(Tree<String> tree) {
        // Have we already computed the answer?
        if (tree.getData() == 0) {
            // Are we a (terminal) leaf?
            if (!tree.hasChildren()) {
                tree.setData(tree.value);
            } else {
                // sum of children
                int c = 0;
                // sum of grandchildren
                int g = 0;
                for (Tree<String> child : tree.getChildren()) {
                    c += maxValue(child);
                    for (Tree<String> grandchild : child.getChildren()) {
                        g += maxValue(grandchild);
                    }
                }
                g += tree.value;
                if (g > c) {
                    tree.setData(g);
                } else {
                    tree.setData(c);
                }
            }
        }
        return tree.getData();
    }

    public static ArrayList<String> who(Tree<String> tree) {
        int me = maxValue(tree);
        int c = 0;
        for (Tree<String> child : tree.getChildren()) {
            c += maxValue(child);
        }

        ArrayList<String> out = new ArrayList<String>();
        if (me > c) {
            out.add(tree.name);
            for (Tree<String> child : tree.getChildren()) {
                for (Tree<String> grandchild : child.getChildren()) {
                    out.addAll(who(grandchild));
                }
            }
        } else {
            for (Tree<String> child : tree.getChildren()) {
                out.addAll(who(child));
            }
        }
        return out;
    }
}

