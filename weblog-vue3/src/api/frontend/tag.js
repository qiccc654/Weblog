import axios from "@/axios";

// 获取标签列表
export function getTagList(data) {
    return axios.post("/tag/list", data)
}
