// ============================================================
// ADD BOTH THESE METHODS to your existing UserDAO.java
// (paste inside the class before the final closing })
// ============================================================

    /** Count of registered customers — used by adminDashboard.jsp */
    public int getCustomerCount() {
        String sql = "SELECT COUNT(*) FROM users WHERE role = 'customer'";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) { e.printStackTrace(); }
        return 0;
    }

    /** Delete a user by ID — used by DeleteAdminServlet */
    public boolean deleteUserById(int id) {
        String sql = "DELETE FROM users WHERE id = ? AND role != 'main_admin'";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }
