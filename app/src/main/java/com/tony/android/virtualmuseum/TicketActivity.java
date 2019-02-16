package com.tony.android.virtualmuseum;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class TicketActivity extends AppCompatActivity {

    int price;
    int numberOfTickets = 0;
    Button priceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
    }

    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView)
                findViewById(R.id.amount_text_view);
        quantityTextView.setText(Integer.toString(number));
    }

    public void plus_button(View view){
        numberOfTickets++;
        displayQuantity(numberOfTickets);
        price = calculatePrice();
        displayPrice(price);
    }

    public void minus_button(View view){
        if(numberOfTickets > 1){
            numberOfTickets--;

        }
        displayQuantity(numberOfTickets);
        price = calculatePrice();
        displayPrice(price);

        if (numberOfTickets == 0){
            price /= 25;
        }
    }
    public void submitOrder(View view){

        displayPrice(price);

        String orderMessage = "Thanks! here's your receipt: " + "\n" + "Hope you enjoy the museum!!" + "\n" + "Price: " + price;

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Revolutionary Museum");
        intent.putExtra(Intent.EXTRA_TEXT, orderMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    private int calculatePrice(){
        price = numberOfTickets * 25;
        return price;
    }

    private void displayPrice(int number){
        if(numberOfTickets > 0) {
            priceButton = findViewById(R.id.order_button);
            priceButton.setText("Order" + "\n" + "$" + number);
        }
    }
}