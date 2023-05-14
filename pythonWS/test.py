def get_info(id_num):
    gender = int(id_num[7])
    birth_year_prefix = id_num[0]
    zodiac = ['원숭이', '닭', '개', '돼지', '쥐', '소', '범', '토끼', '용', '뱀', '말', '양'][(int(birth_year_prefix)-4) % 12]
    star_signs = {
        '0321': '양자리', '0420': '황소자리', '0521': '쌍둥이자리', '0621': '게자리',
        '0723': '사자자리', '0823': '처녀자리', '0924': '천칭자리', '1024': '전갈자리',
        '1123': '사수자리', '1222': '염소자리', '0120': '물병자리'
    }
    birth_date = id_num[0:6]
    if gender in [1, 3, 5, 7]:
        gender = '남자'
        if birth_year_prefix in ['1', '2']:
            birth_year = '19' + birth_year_prefix + id_num[1:3]
        elif birth_year_prefix in ['5', '6']:
            birth_year = '20' + birth_year_prefix + id_num[1:3]
    elif gender in [2, 4, 6, 8]:
        gender = '여자'
        if birth_year_prefix in ['1', '2']:
            birth_year = '19' + birth_year_prefix + id_num[1:3]
        elif birth_year_prefix in ['5', '6']:
            birth_year = '20' + birth_year_prefix + id_num[1:3]
    else:
        return None
    star_sign = star_signs.get(birth_date)

    return gender, birth_year, zodiac, star_sign

while True:
    id_num = str(input("주민등록번호를 입력하세요 (종료하려면 x): "))
    if id_num == 'x':
        break
    elif len(id_num) != 14 or not id_num[:6].isdigit() or not id_num[7:].isdigit() or id_num[6] != '-':
        print("잘못된 형식의 주민등록번호입니다.")
    else:
        info = get_info(id_num)
        if info is None:
            print("잘못된 형식의 주민등록번호입니다.")
        else:
            gender, birth_year, zodiac, star_sign = info
            print(f"성별: {gender}")
            print(f"태어난 연도: {birth_year}")
            print(f"띠: {zodiac}띠")
            print(f"별자리: {star_sign}")
