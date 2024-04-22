
# Rapport

**Skriv din rapport här!**
Gjorde en class genom java > new > Java Class. Denna kallas för Mountain. Jag gav även classen variabler som vi ska använda senare. 
Skapade även getters och setters för att kunna manipulera  objektens/classens data.

Skapade en ArrayList där jag lätter in mountain objects, och ger dem ett namn. Detta aktiverar den constructor som bara tar in värdet name.
Jag sätter även in 3 stycken mountains (och skapar dem) genom ArrayListen.
```
ArrayList <Mountain> mountains = new ArrayList<>(Arrays.asList(
new Mountain("mountain1"),
new Mountain("mountain2"),
new Mountain("mountain3")));

        for(int i=0; i<mountains.size(); i++) {
            Log.d("potato", mountains.get(i).toString());
```
Skapade även en recyclerView genom kodraden nedan.
```
<androidx.recyclerview.widget.RecyclerView
android:id="@+id/recycler_view"
android:layout_width="match_parent"
android:layout_height="match_parent"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />
```
Skapade en recyclerviewitem genom layout > new > Layout Resource File. Denna gjordes till en Linear Layout. I denna skapade jag även en TextView.
```
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/TextViewRecyclerThing"
        />
```
Därefter skapade vi en class, RecyclerViewAdapter. I denna implementerade den kod som finns på canvas.
```
@NonNull
@Override
public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
return null;
}
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
    }
    @Override
    public int getItemCount() {
        return 0;
    }
```
Skapade en RecyclerViewItem klass, och bytte till RecyclerViewItem i de kodrader som tidigare matchat mountains, i main activity.
Lade även till en recyclerView i MainActivity, som vi namngett view. Denna sätter vi till den recycler view vi skapat i activity_main.xml, 
vi sätter även view till en "Linear Layout", samt att vi sätter adaptern på view.
```
RecyclerView view = findViewById(R.id.recycler_view);
view.setLayoutManager(new LinearLayoutManager(this));
view.setAdapter(adapter);
```
Efter fel som innebar att appen krashar hittar vi felet i RecyclerViewAdapter, där "TextViewRecyclerThing" innan innehöll "title", vilket
innebar att vi sätter in en "null" textview, vilket krashade appen. "TextViewRecyclerThing" kom ifrån recyclerviewitem.xml då genom
android:id="@+id/TextViewRecyclerThing"
```
ViewHolder(View itemView) {
...
...
title = itemView.findViewById(R.id.TextViewRecyclerThing);
}
```
La in given URL i kodraden nedan
```
private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
```
Vilket ger oss en URL att arbeta ifrån. Därefter implementerar vi given kod ifrån canvas, vilken unmarshallear
JSON till en lista med objekt. Detta sker i onPostExecute.
```
  public void onPostExecute(String json) {
       ...
        Type type = new TypeToken<ArrayList<RecyclerViewItem>>(){}.getType();
        ArrayList<RecyclerViewItem> listOfMountains = gson.fromJson(json, type);
    }
```



Bilder läggs i samma mapp som markdown-filen.

![](android.png)
