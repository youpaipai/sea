prompt PL/SQL Developer import file
prompt Created on 2016年3月7日 by HZWNB163
set feedback off
set define off
prompt Loading DEMO...
prompt Table is empty
prompt Loading MRBS_MEET...
prompt Table is empty
prompt Loading MRBS_PROJECT...
insert into MRBS_PROJECT (id, project_num, project_name, purchase_type, budget, proxy_org_id, link_phone_num, open_bid_time, sl_time, is_del, is_valid, create_user, create_time, update_user, update_time, project_check_status, check_center_id)
values (1, 'ptoject_001', '上海项目', 1, 2000.2, 1, '110', to_date('07-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), '0', '1', '888', to_date('10-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), null, null, '1', 1);
insert into MRBS_PROJECT (id, project_num, project_name, purchase_type, budget, proxy_org_id, link_phone_num, open_bid_time, sl_time, is_del, is_valid, create_user, create_time, update_user, update_time, project_check_status, check_center_id)
values (2, 'ptoject_002', '江苏项目', 2, 6000.52, 2, '120', to_date('07-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), '0', '1', '777', to_date('10-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), null, null, '2', 2);
insert into MRBS_PROJECT (id, project_num, project_name, purchase_type, budget, proxy_org_id, link_phone_num, open_bid_time, sl_time, is_del, is_valid, create_user, create_time, update_user, update_time, project_check_status, check_center_id)
values (3, 'ptoject_003', '浙江项目', 3, 8000.98, 3, '119', to_date('07-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), '0', '1', '999', to_date('10-03-2016 09:40:00', 'dd-mm-yyyy hh24:mi:ss'), null, null, '3', 3);
commit;
prompt 3 records loaded
prompt Loading MRBS_BOOK_MEET...
prompt Table is empty
prompt Loading MRBS_DEPMENT...
insert into MRBS_DEPMENT (id, dept_num, dept_name, dept_type, dept_link_user, mobile_phone, remark, is_del, is_valid, create_user, create_time, update_user, update_time)
values (2, null, '2', '2', '2', '2', '' || chr(9) || '' || chr(9) || '' || chr(9) || '  ' || chr(13) || '' || chr(10) || '' || chr(9) || '2' || chr(9) || '' || chr(9) || '', '0', '1', null, null, null, null);
insert into MRBS_DEPMENT (id, dept_num, dept_name, dept_type, dept_link_user, mobile_phone, remark, is_del, is_valid, create_user, create_time, update_user, update_time)
values (1, '1', '1', '1', '1', '1', '1', '0', '1', '1', to_date('30-12-1899 01:00:00', 'dd-mm-yyyy hh24:mi:ss'), '1', null);
commit;
prompt 2 records loaded
prompt Loading MRBS_DICT_PARENT...
prompt Table is empty
prompt Loading MRBS_DICT_CHILD...
prompt Table is empty
prompt Loading MRBS_USER...
prompt Table is empty
prompt Loading MRBS_LOG...
prompt Table is empty
prompt Loading MRBS_MEET_COUNT...
insert into MRBS_MEET_COUNT (id, name, begin_time, end_time, sort_num, is_valid, is_del, create_time, update_time, create_user, update_user)
values (1, '1', null, null, '1', 0, null, null, null, null, null);
insert into MRBS_MEET_COUNT (id, name, begin_time, end_time, sort_num, is_valid, is_del, create_time, update_time, create_user, update_user)
values (2, '1', null, null, '1', 0, null, null, null, null, null);
commit;
prompt 2 records loaded
prompt Loading MRBS_MENU...
insert into MRBS_MENU (menu_id, menu_name, menu_url, parent_menu_id, is_del, is_valid, create_user, update_user, create_time, update_time)
values (4, '采购中心用户', 'acm/queryACM.do', '0', '0', '1', '1', '1', null, null);
insert into MRBS_MENU (menu_id, menu_name, menu_url, parent_menu_id, is_del, is_valid, create_user, update_user, create_time, update_time)
values (5, '代理机构用户', 'npu/queryNPU.do', '0', '0', '1', '1', '1', null, null);
insert into MRBS_MENU (menu_id, menu_name, menu_url, parent_menu_id, is_del, is_valid, create_user, update_user, create_time, update_time)
values (6, '用户管理', 'user/queryAllUser.do', '0', '0', '1', '1', '1', null, null);
insert into MRBS_MENU (menu_id, menu_name, menu_url, parent_menu_id, is_del, is_valid, create_user, update_user, create_time, update_time)
values (1, '机构管理', 'om/manage.do', '0', '0', '1', '1', '1', null, null);
insert into MRBS_MENU (menu_id, menu_name, menu_url, parent_menu_id, is_del, is_valid, create_user, update_user, create_time, update_time)
values (2, '场次管理', 'pcmMeet/queryMeetCounts.do', '0', '0', '1', '1', '1', null, null);
insert into MRBS_MENU (menu_id, menu_name, menu_url, parent_menu_id, is_del, is_valid, create_user, update_user, create_time, update_time)
values (3, '报表导出', 'trx/queryTRX.do', '0', '0', '1', '1', '1', null, null);
insert into MRBS_MENU (menu_id, menu_name, menu_url, parent_menu_id, is_del, is_valid, create_user, update_user, create_time, update_time)
values (7, '日志管理', 'lm/queryLM.do', '0', '0', '1', '1', '1', null, null);
commit;
prompt 7 records loaded
prompt Loading MRBS_PRIVATE_MEET...
prompt Table is empty
prompt Loading MRBS_ROLE...
prompt Table is empty
prompt Loading MRBS_ROLE_MENU...
prompt Table is empty
prompt Loading MRBS_USER_ROLE...
prompt Table is empty
set feedback on
set define on
prompt Done.
