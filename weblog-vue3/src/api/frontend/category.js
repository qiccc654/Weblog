import axios from "@/axios";

// 获取分类列表
export function getCategoryList(data) {
    return axios.post("/category/list", data)
}
