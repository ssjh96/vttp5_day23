set @po_id = 'abcd1234';

insert into purchase_orders(po_id, name, address, delivery_date)
    values (@po_id, 'fred', 'dummy address', '2025-01-31');

insert into line_items(name, quanity, unit_price, po_id)
    values
        ('apple', 10, 5, @po_id),
        ('orange', 8, 4, @po_id),
        ('pear', 6, 3, @po_id);


        