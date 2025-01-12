SET @po_id = 'efgh5678';

INSERT INTO purchase_orders(po_id, name, address, delivery_date)
    VALUES (@po_id, 'barney', 'dummy address 2', '2025-02-15');

INSERT INTO line_items(name, quantity, unit_price, po_id) 
    VALUES
        ('banana', 6, 1.2, @po_id),
        ('orange', 12, 0.8, @po_id),
        ('watermelon', 1, 3.0, @po_id);
