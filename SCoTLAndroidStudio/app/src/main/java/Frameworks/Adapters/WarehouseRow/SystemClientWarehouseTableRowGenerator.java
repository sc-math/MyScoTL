package Frameworks.Adapters.WarehouseRow;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.scotl.UpdateAndRemovePropertyActivity;
import com.example.scotl.UpdateAndRemoveWarehouseActivity;

import java.util.ArrayList;

import Policy.Entity.Warehouse;

public class SystemClientWarehouseTableRowGenerator
    implements
        WarehouseTableRowGenerator
{
    public SystemClientWarehouseTableRowGenerator() {}

    @Override
    public TableRow[] GenerateLines(Warehouse[] warehouseArray, Context context)
    {
        if (warehouseArray == null)
        {
            return null;
        }

        ArrayList<TableRow> tableRowList = new ArrayList<TableRow>();

        for(Warehouse e : warehouseArray)
        {
            if(e == null)
            {
                continue;
            }
            TableRow tableRow = new TableRow(context);

            TextView idWarehouseText = new TextView(context);
            ConfigureTextView(idWarehouseText, e.GetId());

            TextView cpfPropText = new TextView(context);
            ConfigureTextView(cpfPropText, e.GetOwner().GetCpf());

            TextView hiringDateText = new TextView(context);
            ConfigureTextView(hiringDateText, e.GetBeginDate());

            tableRow.addView(idWarehouseText);
            tableRow.addView(cpfPropText);
            tableRow.addView(hiringDateText);

            tableRow.setOnClickListener
                    (
                            view ->
                            {
                                UpdateAndRemoveWarehouseActivity.SetWarehouse(e);
                                context.startActivity(new Intent(context, UpdateAndRemoveWarehouseActivity.class));
                            }
                    );

            tableRowList.add(tableRow);
        }

        if(tableRowList.isEmpty())
        {
            return null;
        }

        TableRow[] toReturn = new TableRow[tableRowList.size()];
        int index = -1;
        for(TableRow tb : tableRowList)
        {
            ++index;
            if(tb == null)
            {
                continue;
            }

            toReturn[index] = tb;
        }

        return toReturn;

    }

    private void ConfigureTextView(TextView textView, String content)
    {
        textView.setText(content);
        textView.setTextColor(Color.parseColor("#2F4F4F"));
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        textView.setVisibility(View.VISIBLE);
        textView.setPadding(30, 30, 30, 30);
        textView.setTextSize(15);
    }
}
