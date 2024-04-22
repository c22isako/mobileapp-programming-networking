
# Rapport

**Skriv din rapport här!**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

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
Därefter skapade vi en class, RecyclerViewAdapter. I denna implementerade vi bara de metoder som i nuläget behövs.

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


Bilder läggs i samma mapp som markdown-filen.

![](android.png)
