# learn_github
Những sự cố thường gặp trong Git
1. Viết sai message commit
Để thay đổi nộ dung commit, thêm, sửa file vào commit rất đơn giản bạn chỉ cần sử dụng
git commit --amend
2. Đặt sai tên branch
Việc gõ nhầm hay thiết thành phần theo convention khi đặt tên branch là không hiếm. Lúc mới tiếp cận bạn thường lựa chọn giải pháp là tạo một branch mới. Có một cách nhanh hơn rất nhiều giống như rename trong các phần làm việc với file đó là dùng câu lệnh:
git branch -m <tên branch sau khi đổi>
3. Commit chơi chơi và giờ muốn nó bay màu
Việc làm ngốc ngếch này diễn ra thường xuyên trong quá trình làm việc, vậy làm thế nào để code dữ nguyên và xóa commit đó đi, đầu tiên bạn phải tìm hiểu một số lý thuyết sau:
Note: HEAD, Working tree, Index trong git là gì?

Git giữ một con trỏ đặc biệt có tên HEAD. Trong Git, đây là một con trỏ tới nhánh nội bộ mà bạn đang làm việc
Trên Git, những thư mục được đặt trong sự quản lý của Git mà mọi người đang thực hiện công việc trong thực tế được gọi là working tree.
Giữa repository và working tree tồn tại một nơi gọi là index. Index là nơi để chuẩn bị cho việc commit lên repository
Cách 1: Sử dụng reset (khi chưa có ai pull về)
git reset HEAD~

Di chuyển HEAD về vị trí commit reset và vẫn giữ nguyên tất cả các thay đổi của file, nhưng loại bỏ các thay đổi khỏi stage (Đưa HEAD và index về như cũ)

git reset {commit_id}
git reset --hard HEAD~

Di chuyển con trỏ HEAD về vị trí commit reset và loại bỏ tất cả sự thay đổi của file sau thời điểm commit reset
HEAD~ có ý nghĩa giống với HEAD^ hay @^, nghĩa là quay về trước 1 commit
Muốn quay về trước n commit, VD 5 commit thì có thể thay bằng HEAD~5.
--hard có nghĩa là bỏ commit đi và bỏ cả những thay đổi chưa được commit trong working space. Khi này môi trường sẽ hoàn toàn "sạch sẽ" như thời điểm trước khi commit
git reset --soft HEAD~

Lệnh này chỉ di chuyển HEAD về vị trí commit reset. Trạng thái của stage và tất cả sự thay đổi của file sẽ được giữ nguyên
--soft có nghĩa là bỏ commit đi nhưng giữ nguyên những thay đổi chưa được commit trong working space.
--soft hữu dụng khi bạn muốn giữ lại những thay đổi chưa commit cho lần commit tiếp theo
Cách 2: Sử dụng revert (người khác đã pull về)
# commit_hash là mã commit
git revert <commit_hash>
Cách 3: Sử dụng --amend
git commit --amend
