import React from 'react';
import {useNavigate} from 'react-router-dom';

import '../../screens/notice/index.scss';

function NoticeList() {
  const navigate = useNavigate();
  const list = [
    [1, '제목', '작성자', '2022-03-19'],
    [2, '제목2', '작성자2', '2022-03-19'],
    [3, '제목2', '작성자2', '2022-03-19'],
  ];
  return (
    <div id="notice_items">
      <ul className="list_table">
        <li className="fs-16 preMid list_table_top">
          <ul className="flex">
            <li>No.</li>
            <li>제목</li>
            <li>작성자</li>
            <li>작성일</li>
          </ul>
        </li>
        {list &&
          list.map(item => (
            <li key={item[0]}>
              <ul className="flex">
                <li className="flex align-center justify-center preReg fs-14">
                  {item[0]}
                </li>

                <li className="flex align-center justify-center list_table_items_subject">
                  <button
                    type="button"
                    className="preReg fs-14"
                    onClick={() => navigate('/')}>
                    {item[1]}
                  </button>
                </li>
                <li className="flex align-center justify-center preReg fs-14">
                  {item[2]}
                </li>
                <li className="flex align-center justify-center preReg fs-14">
                  {item[3]}
                </li>
              </ul>
            </li>
          ))}
      </ul>
    </div>
  );
}

export default NoticeList;
