@echo off
REM 7-zip���C���X�g�[�����Ă���O��ł�
set ZIP_PATH="C:\Program Files\7-Zip\7z.exe"
REM �I���W�i���̃t�H���_���X�g(Java�j
set ORI_FOLDER1="src\main\java\jp\co\sss\practice\p02"
set ORI_FOLDER2="src\main\java\jp\co\sss\practice\p03"
set ORI_FOLDER3="src\main\java\jp\co\sss\practice\p04"
set ORI_FOLDER4="src\main\java\jp\co\sss\practice\p05"
set ORI_FOLDER5="src\main\java\jp\co\sss\practice\p06"
set ORI_FOLDER6="src\main\java\jp\co\sss\practice\p07"
set ORI_FOLDER7="src\main\java\jp\co\sss\practice\p08"
set ORI_FOLDER8="src\main\java\jp\co\sss\practice\p09"
set ORI_FOLDER9="src\main\java\jp\co\sss\practice\p10"
set ORI_FOLDER10="src\main\java\jp\co\sss\practice\p11"
set ORI_FOLDER11="src\main\java\jp\co\sss\practice\p12"
REM �I���W�i���̃t�H���_���X�g(HTML�j
set ORI_FOLDER12="src\main\resources\templates\practice02"
set ORI_FOLDER13="src\main\resources\templates\practice03"
set ORI_FOLDER14="src\main\resources\templates\practice04"
set ORI_FOLDER15="src\main\resources\templates\practice05"
set ORI_FOLDER16="src\main\resources\templates\practice06"
set ORI_FOLDER17="src\main\resources\templates\practice07"
set ORI_FOLDER18="src\main\resources\templates\practice08"
set ORI_FOLDER19="src\main\resources\templates\practice09"
set ORI_FOLDER20="src\main\resources\templates\practice10"
set ORI_FOLDER21="src\main\resources\templates\practice11"
set ORI_FOLDER22="src\main\resources\templates\practice12"
REM �I���W�i���̃t�H���_���X�g(�v���p�e�B�j
set ORI_FOLDER23="src\main\resources\ValidationMessages.properties"
set ORI_FOLDER24="src\main\resources\messages.properties"
set ORI_FOLDER25="src\main\resources\application.properties"

REM �ړ���̃t�H���_���X�g
set FOLDER0="�𓚃\�[�X�R�[�h�i��u���p�j"
set FOLDER1="01_��{����"
set FOLDER2="02_��ʑJ��"
set FOLDER3="03_�t�H�[������"
set FOLDER4="04_�X�R�[�v"
set FOLDER5="05_�f�[�^�x�[�X����(CRUD)"
set FOLDER6="06_�f�[�^�x�[�X����(�O���Q��)"
set FOLDER7="07_�f�[�^�x�[�X����(JPQL)"
set FOLDER8="08_���̓`�F�b�N"
set FOLDER9="09_���b�Z�[�W�\��"
set FOLDER10="10_�t�B���^"
set FOLDER11="11_Thymeleaf"

set FOLDER12="Java"
set FOLDER13="HTML"

REM �ړ���̃t�H���_�쐬
md ..\%FOLDER0%
md ..\%FOLDER0%\%FOLDER1%
md ..\%FOLDER0%\%FOLDER2%
md ..\%FOLDER0%\%FOLDER3%
md ..\%FOLDER0%\%FOLDER4%
md ..\%FOLDER0%\%FOLDER5%
md ..\%FOLDER0%\%FOLDER6%
md ..\%FOLDER0%\%FOLDER7%
md ..\%FOLDER0%\%FOLDER8%
md ..\%FOLDER0%\%FOLDER9%
md ..\%FOLDER0%\%FOLDER10%
md ..\%FOLDER0%\%FOLDER11%

REM �t�H���_��U�蕪����
xcopy /e /i /h %ORI_FOLDER1% ..\%FOLDER0%\%FOLDER1%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER12% ..\%FOLDER0%\%FOLDER1%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER2% ..\%FOLDER0%\%FOLDER2%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER13% ..\%FOLDER0%\%FOLDER2%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER3% ..\%FOLDER0%\%FOLDER3%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER14% ..\%FOLDER0%\%FOLDER3%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER4% ..\%FOLDER0%\%FOLDER4%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER15% ..\%FOLDER0%\%FOLDER4%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER5% ..\%FOLDER0%\%FOLDER5%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER16% ..\%FOLDER0%\%FOLDER5%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER6% ..\%FOLDER0%\%FOLDER6%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER17% ..\%FOLDER0%\%FOLDER6%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER7% ..\%FOLDER0%\%FOLDER7%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER18% ..\%FOLDER0%\%FOLDER7%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER8% ..\%FOLDER0%\%FOLDER8%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER19% ..\%FOLDER0%\%FOLDER8%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER9% ..\%FOLDER0%\%FOLDER9%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER20% ..\%FOLDER0%\%FOLDER9%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER10% ..\%FOLDER0%\%FOLDER10%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER21% ..\%FOLDER0%\%FOLDER10%\%FOLDER13%
xcopy /e /i /h %ORI_FOLDER11% ..\%FOLDER0%\%FOLDER11%\%FOLDER12%
xcopy /e /i /h %ORI_FOLDER22% ..\%FOLDER0%\%FOLDER11%\%FOLDER13%

copy %ORI_FOLDER23% ..\%FOLDER0%\%FOLDER9%
copy %ORI_FOLDER24% ..\%FOLDER0%\%FOLDER9%

REM �t�H���_���Ƃ�zip��
REM 7-zip���C���X�g�[�����Ă���O��ł�
for /d %%f in (..\%FOLDER0%\*) do (
  echo Compressing %%f
  %ZIP_PATH% a -tzip %%f.zip %%f
)

explorer ..\%FOLDER0%

exit /B 0