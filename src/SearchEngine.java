/*
This is the class that holds my methods for BFS
*/

public class SearchEngine{

  List<Road_Items> dataList;
  String source;
  String destinition;
  
  public SearchEngine(List<Road_Items>dataList, String Source, String destinition){
    
    this.datalist=dataList;
    this.source=source;
    this.destinition=destinition;
    
  }
  
  public String getDestinition(){
    
    dataList.forEach((Road_Items road_item)->
                    if(road_item.child.destinition.equals(destinition)){
                      return destinition;
                    }else{
                    }
                    );
  }
  
}
