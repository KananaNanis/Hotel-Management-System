
import java.util.List;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dr.Korsah
 * modified by Claire Chemutai
 * modified by Nanis Kanana
 * @param <T>
 */
public final class OrgStructure<T> {
    protected Node<T> root;
    
    public static class Node<T> {
        private final T elements;
        private final List< Node<T> > children;
    
    
    public Node(T e){
            elements = e;
            children = new LinkedList<  >();
        }    
    public void addChild(Node<T> node) {
            children.add(node);
        }
                
        // removes all the children of this node.
        public void clearChildren() {
            children.clear();
        }
    }
    // constructor to create an empty tree
  public OrgStructure() {
        root = null;
    }
    
    // constructor to create a tree with only a root node
    public OrgStructure(T rootElement) {
        root = new Node<>(rootElement);
    }
    public OrgStructure(T rootElement, OrgStructure<T>... subTrees) {
        root = new Node<>(rootElement);
        addSubTrees(subTrees);
    }
    
    public void addSubTrees(OrgStructure<T>... subTrees) {
        if (subTrees.length > 0) {
            for (OrgStructure<T> subTree : subTrees) {
                if (subTree != null) {
                    root.addChild(subTree.root);
                }
            }
        }
    }
    
    public void setSubTrees(OrgStructure<T>... subTrees) {
        root.clearChildren();
        addSubTrees(subTrees);
    }
    
    // A method to draw a tree 
    public void drawTree() {
        if (root != null)
             drawSubTree(root, 0); 
        else
            System.out.println("The tree is empty"); 
    }
    
    private void drawSubTree(Node<T> curNode, int indentLevel){
        if (curNode != null) {
            for (int i=0; i<indentLevel; i++)
                System.out.print("\t");
            System.out.println(curNode.elements + " ");
            
            List< Node<T> > children = curNode.children;
            children.forEach((child) -> {
               drawSubTree(child,indentLevel+1);
            });
        }
        
    }
    
   
  
    }
  
  
     
    

