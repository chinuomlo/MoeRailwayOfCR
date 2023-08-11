lists=['ty25k_cr_window_end_l',
'ty25k_cr_window_end_r',
'ty25k_cr_window_open',
'ty25k_cr_window',
'ty25k_cr_windowl',
'ty25k_cr_window_small',
'ty25k_cr_up',
'ty25k_cr_md',
'ty25k_cr_dw',
'ty25k_cr_dw_b',
'ty25k_cr_dw_b_l',
'ty25k_cr_dw_b_r',
'ty25k_top',
'ty25k_topkt',
'ty25k_floor',
'ty25k_floor_120k',
'ty25k_unventi',]

for a in lists:
    a = '''
'''+'''"item.hikanamlora.'''+a+'''":"",'''+'''
'''+'''"block.hikanamlora.'''+a+'''":"",'''
    
    print(a)