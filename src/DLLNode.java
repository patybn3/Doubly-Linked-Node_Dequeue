//----------------------------------------------------------------------------
// DLLNode.java              by Dale/Joyce/Weems                     Chapter 4
//
// Implements nodes holding info of class <T> for a doubly linked list.
//----------------------------------------------------------------------------

public class DLLNode<T>
{
  protected T info;
  protected DLLNode<T> forward, back;
  
  public DLLNode(T info)
  {
    this.info = info; forward = null; back = null;
  }
 
  public void setInfo(T info){this.info = info;}
  public T getInfo(){return info;}
  
  public void setForward(DLLNode<T> forward){this.forward = forward;}
  public void setBack(DLLNode<T> back){this.back = back;}
  
  public DLLNode getForward(){return forward;}
  public DLLNode getBack(){return back;}
}
 
 