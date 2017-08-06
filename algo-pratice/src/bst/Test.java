package bst;





class Test
{
public static void main(String[] args)
{
BST  t = new BST();
t.Insert(40);
t.Insert(20);
t.Insert(10);
t.Insert(30);
t.Insert(60);
t.Insert(50);
t.Insert(70);
t.Insert(5);
t.Insert(45);
t.Insert(55);
Bound.leafy(BST.root);
Bound.leafNodes(BST.root);
Bound.righty(BST.root);
}
}


class Bound{
static void leafy(BSTNode root)
{ 
if(root.left!=null)
{
System.out.println(root.data);
leafy(root.left);
}
}
static void righty(BSTNode root)
{ 
if(root.right!=null)
{
righty(root.right);
    if(root!=BST.root)
System.out.println(root.data);
}
}
static void leafNodes(BSTNode root)
{
if(root!=null && root.left==null && root.right==null)
{
System.out.println(root.data);
return;
}
if(root!=null)
{	leafNodes(root.left);
leafNodes(root.right);
}
}
}
