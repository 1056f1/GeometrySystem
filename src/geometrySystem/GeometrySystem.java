package geometrySystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import geometrySystem.GeometrySystem;

public class GeometrySystem extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel panel_1 = new JPanel();
    private JPanel panel_2 = new JPanel();
    private JLabel label = new JLabel("小学数学几何图形生成系统");
    private JButton btn_line = new JButton("线段");
    private JButton btn_angle = new JButton("角");
    private JButton btn_triangle = new JButton("三角形");
    private JButton btn_square = new JButton("正方形");
    private JButton btn_rectangle = new JButton("长方形");
    private JButton btn_parallelogram = new JButton("平行四边形");
    private JButton btn_trapezoid = new JButton("梯形");
    private JButton btn_diamond = new JButton("菱形");
    private JButton btn_circle = new JButton("圆形");
    private JButton btn_sector = new JButton("扇形");
    private JButton btn_cube = new JButton("正方体");
    private JButton btn_cuboid = new JButton("长方体");
    private JButton btn_cylinder = new JButton("圆柱体");
    private JButton btn_cone = new JButton("圆锥体");
    private JTextField txt = new JTextField();
    private JTextArea area = new JTextArea();

    public GeometrySystem() {
        this.setTitle("小学数学几何图形生成系统");
        this.setSize(600, 530);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel_1.setLayout(new GridLayout(5, 3, 10, 10));
        panel_1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        label.setHorizontalAlignment(JLabel.CENTER);
        txt.setHorizontalAlignment(JTextField.CENTER);
        area.setEditable(false);
        area.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(area);

        Container contentPane = this.getContentPane();
        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(panel_1, BorderLayout.CENTER);
        contentPane.add(txt, BorderLayout.SOUTH);
        contentPane.add(scrollPane, BorderLayout.EAST);

        panel_1.add(btn_line);
        panel_1.add(btn_angle);
        panel_1.add(btn_triangle);
        panel_1.add(btn_square);
        panel_1.add(btn_rectangle);
        panel_1.add(btn_parallelogram);
        panel_1.add(btn_trapezoid);
        panel_1.add(btn_diamond);
        panel_1.add(btn_circle);
        panel_1.add(btn_sector);
        panel_1.add(btn_cube);
        panel_1.add(btn_cuboid);
        panel_1.add(btn_cylinder);
        panel_1.add(btn_cone);

        btn_line.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("请输入线段长度：");
                try {
                    double len = Double.parseDouble(input);
                    txt.setText("线段长度为：" + len);
                    area.append("已生成线段，长度为：" + len + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_angle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("请输入角的度数：");
                try {
                    double degree = Double.parseDouble(input);
                    txt.setText("角的度数为：" + degree);
                    area.append("已生成角，度数为：" + degree + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_triangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入三角形底边长度：");
                String input2 = JOptionPane.showInputDialog("请输入三角形高：");
                try {
                    double base = Double.parseDouble(input1);
                    double height = Double.parseDouble(input2);
                    double areaValue = 0.5 * base * height;
                    txt.setText("三角形面积为：" + areaValue);
                    area.append("已生成三角形，底边长为：" + base + "，高为：" + height + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("请输入正方形边长：");
                try {
                    double len = Double.parseDouble(input);
                    double areaValue = len * len;
                    txt.setText("正方形面积为：" + areaValue);
                    area.append("已生成正方形，边长为：" + len + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_rectangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入长方形长：");
                String input2 = JOptionPane.showInputDialog("请输入长方形宽：");
                try {
                    double length = Double.parseDouble(input1);
                    double width = Double.parseDouble(input2);
                    double areaValue = length * width;
                    txt.setText("长方形面积为：" + areaValue);
                    area.append("已生成长方形，长为：" + length + "，宽为：" + width + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_parallelogram.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入平行四边形底边长度：");
                String input2 = JOptionPane.showInputDialog("请输入平行四边形高：");
                try {
                    double base = Double.parseDouble(input1);
                    double height = Double.parseDouble(input2);
                    double areaValue = base * height;
                    txt.setText("平行四边形面积为：" + areaValue);
                    area.append("已生成平行四边形，底边长为：" + base + "，高为：" + height + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_trapezoid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入梯形上底长度：");
                String input2 = JOptionPane.showInputDialog("请输入梯形下底长度：");
                String input3 = JOptionPane.showInputDialog("请输入梯形高：");
                try {
                    double upperBase = Double.parseDouble(input1);
                    double lowerBase = Double.parseDouble(input2);
                    double height = Double.parseDouble(input3);
                    double areaValue = 0.5 * (upperBase + lowerBase) * height;
                    txt.setText("梯形面积为：" + areaValue);
                    area.append("已生成梯形，上底长为：" + upperBase + "，下底长为：" + lowerBase + "，高为：" + height + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_diamond.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入菱形对角线 1 长度：");
                String input2 = JOptionPane.showInputDialog("请输入菱形对角线 2 长度：");
                try {
                    double diagonal1 = Double.parseDouble(input1);
                    double diagonal2 = Double.parseDouble(input2);
                    double areaValue = 0.5 * diagonal1 * diagonal2;
                    txt.setText("菱形面积为：" + areaValue);
                    area.append("已生成菱形，对角线 1 长度为：" + diagonal1 + "，对角线 2 长度为：" + diagonal2 + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_circle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("请输入圆形半径长度：");
                try {
                    double radius = Double.parseDouble(input);
                    double areaValue = Math.PI * radius * radius;
                    txt.setText("圆形面积为：" + areaValue);
                    area.append("已生成圆形，半径长度为：" + radius + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_sector.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入扇形半径长度：");
                String input2 = JOptionPane.showInputDialog("请输入扇形角度数：");
                try {
                    double radius = Double.parseDouble(input1);
                    double degree = Double.parseDouble(input2);
                    double areaValue = Math.PI * radius * radius * degree / 360;
                    txt.setText("扇形面积为：" + areaValue);
                    area.append("已生成扇形，半径长度为：" + radius + "，角度为：" + degree + "，面积为：" + areaValue + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_cube.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("请输入正方体边长：");
                try {
                    double len = Double.parseDouble(input);
                    double volume = len * len * len;
                    double surfaceArea = 6 * len * len;
                    txt.setText("正方体体积为：" + volume + "，表面积为：" + surfaceArea);
                    area.append("已生成正方体，边长为：" + len + "，体积为：" + volume + "，表面积为：" + surfaceArea + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_cuboid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入长方体长：");
                String input2 = JOptionPane.showInputDialog("请输入长方体宽：");
                String input3 = JOptionPane.showInputDialog("请输入长方体高：");
                try {
                    double length = Double.parseDouble(input1);
                    double width = Double.parseDouble(input2);
                    double height = Double.parseDouble(input3);
                    double volume = length * width * height;
                    double surfaceArea = 2 * (length * width + length * height + width * height);
                    txt.setText("长方体体积为：" + volume + "，表面积为：" + surfaceArea);
                    area.append("已生成长方体，长为：" + length + "，宽为：" + width + "，高为：" + height + "，体积为：" + volume + "，表面积为：" + surfaceArea + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_cylinder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入圆柱体底圆半径：");
                String input2 = JOptionPane.showInputDialog("请输入圆柱体高：");
                try {
                    double radius = Double.parseDouble(input1);
                    double height = Double.parseDouble(input2);
                    double volume = Math.PI * radius * radius * height;
                    double surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
                    txt.setText("圆柱体体积为：" + volume + "，表面积为：" + surfaceArea);
                    area.append("已生成圆柱体，底圆半径为：" + radius + "，高为：" + height + "，体积为：" + volume + "，表面积为：" + surfaceArea + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });

        btn_cone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input1 = JOptionPane.showInputDialog("请输入圆锥体底圆半径：");
                String input2 = JOptionPane.showInputDialog("请输入圆锥体高：");
                try {
                    double radius = Double.parseDouble(input1);
                    double height = Double.parseDouble(input2);
                    double volume = 1.0 / 3 * Math.PI * radius * radius * height;
                    double surfaceArea = Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
                    txt.setText("圆锥体体积为：" + volume + "，表面积为：" + surfaceArea);
                    area.append("已生成圆锥体，底圆半径为：" + radius + "，高为：" + height + "，体积为：" + volume + "，表面积为：" + surfaceArea + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入数字！");
                }
            }
        });
    }

    private static Object get2DShape(String shape, double[] params) {
        switch (shape) {
            case "line":
                return "已生成线段，长度为：" + params[0];
            case "angle":
                return "已生成角，度数为：" + params[0];
            case "triangle":
                double base = params[0];
                double height = params[1];
                double areaValue = 0.5 * base * height;
                return "已生成三角形，底边长为：" + base + "，高为：" + height + "，面积为：" + areaValue;
            case "square":
                double len = params[0];
                double areaValue2 = len * len;
                return "已生成正方形，边长为：" + len + "，面积为：" + areaValue2;
            case "rectangle":
                double length = params[0];
                double width = params[1];
                double areaValue3 = length * width;
                return "已生成长方形，长为：" + length + "，宽为：" + width + "，面积为：" + areaValue3;
            case "parallelogram":
                double base2 = params[0];
                double height2 = params[1];
                double areaValue4 = base2 * height2;
                return "已生成平行四边形，底边长为：" + base2 + "，高为：" + height2 + "，面积为：" + areaValue4;
            case "trapezoid":
                double upperBase = params[0];
                double lowerBase = params[1];
                double height3 = params[2];
                double areaValue5 = 0.5 * (upperBase + lowerBase) * height3;
                return "已生成梯形，上底长为：" + upperBase + "，下底长为：" + lowerBase + "，高为：" + height3 + "，面积为：" + areaValue5;
            case "diamond":
                double diagonal1 = params[0];
                double diagonal2 = params[1];
                double areaValue6 = 0.5 * diagonal1 * diagonal2;
                return "已生成菱形，对角线 1 长度为：" + diagonal1 + "，对角线 2 长度为：" + diagonal2 + "，面积为：" + areaValue6;
            case "circle":
                double radius = params[0];
                double areaValue7 = Math.PI * radius * radius;
                return "已生成圆形，半径长度为：" + radius + "，面积为：" + areaValue7;
            case "sector":
                double radius2 = params[0];
                double degree = params[1];
                double areaValue8 = Math.PI * radius2 * radius2 * degree / 360;
                return "已生成扇形，半径长度为：" + radius2 + "，角度为：" + degree + "，面积为：" + areaValue8;
            default:
                return "不支持的几何图形类型！";
        }
    }

    private static Object get3DShape(String shape, double[] params) {
        switch (shape) {
            case "cube":
                double len = params[0];
                double volume = len * len * len;
                double surfaceArea = 6 * len * len;
                return "已生成正方体，边长为：" + len + "，体积为：" + volume + "，表面积为：" + surfaceArea;
            case "cuboid":
                double length = params[0];
                double width = params[1];
                double height = params[2];
                double volume2 = length * width * height;
                double surfaceArea2 = 2 * (length * width + length * height + width * height);
                return "已生成长方体，长为：" + length + "，宽为：" + width + "，高为：" + height + "，体积为：" + volume2 + "，表面积为：" + surfaceArea2;
            case "cylinder":
            double radius = params[0];
            double height1 = params[1];
            double volume3 = Math.PI * radius * radius * height1;
            double surfaceArea3 = 2 * Math.PI * radius * height1 + 2 * Math.PI * radius * radius;
            return "已生成圆柱体，底圆半径为：" + radius + "，高为：" + height1 + "，体积为：" + volume3 + "，表面积为：" + surfaceArea3;
            case "cone":
            double radius2 = params[0];
            double height2 = params[1];
            double volume4 = 1.0 / 3 * Math.PI * radius2 * radius2 * height2;
            double surfaceArea4 = Math.PI * radius2 * (radius2 + Math.sqrt(radius2 * radius2 + height2 * height2));
            return "已生成圆锥体，底圆半径为：" + radius2 + "，高为：" + height2 + "，体积为：" + volume4 + "，表面积为：" + surfaceArea4;
            default:
            return "不支持的三维几何图形类型！";
            }
       }
  

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometry Calculator");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel2D = new JPanel(new BorderLayout());
        JList<String> list2D = new JList<>(new String[]{"线段", "角", "三角形", "正方形", "长方形", "平行四边形", "梯形", "菱形", "圆形", "扇形"});
        JScrollPane scrollPane2D = new JScrollPane(list2D);
        panel2D.add(scrollPane2D, BorderLayout.WEST);
        JTextArea area2D = new JTextArea();
        panel2D.add(area2D, BorderLayout.CENTER);
        JButton btn_area2D = new JButton("计算面积");
        panel2D.add(btn_area2D, BorderLayout.SOUTH);
        tabbedPane.addTab("二维几何图形", panel2D);

        JPanel panel3D = new JPanel(new BorderLayout());
        JList<String> list3D = new JList<>(new String[]{"正方体", "长方体", "圆柱体", "圆锥体"});
        JScrollPane scrollPane3D = new JScrollPane(list3D);
        panel3D.add(scrollPane3D, BorderLayout.WEST);
        JTextArea area3D = new JTextArea();
        panel3D.add(area3D, BorderLayout.CENTER);
        JButton btn_area3D = new JButton("计算表面积和体积");
        panel3D.add(btn_area3D, BorderLayout.SOUTH);
        tabbedPane.addTab("三维几何图形", panel3D);

        panel.add(tabbedPane, BorderLayout.CENTER);

        JPanel panelConfig = new JPanel(new FlowLayout());
        JLabel label = new JLabel("选择度量单位：");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"米", "厘米", "毫米"});
        panelConfig.add(label);
        panelConfig.add(comboBox);

        panel.add(panelConfig, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.setVisible(true);

        btn_area2D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String shape = list2D.getSelectedValue();
                if (shape == null) {
                    JOptionPane.showMessageDialog(null, "请选择一个几何图形！");
                    return;
                }
                String unit = (String) comboBox.getSelectedItem();
                double factor = 1.0;
                switch (unit) {
                    case "米":
                        factor = 1.0;
                        break;
                    case "厘米":
                        factor = 100.0;
                        break;
                    case "毫米":
                        factor = 1000.0;
                        break;	
                }
                double[] params = showInputDialogAndGetParams(shape, "请输入几何图形的参数（请以空格分隔多个参数）：", factor);               
                Object result = get2DShape(shape, params);
                area2D.append(result + "，单位为：" + unit + "\n");
            }
        });
       
        btn_area3D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String shape = list3D.getSelectedValue();
                if (shape == null) {
                    JOptionPane.showMessageDialog(null, "请选择一个几何图形！");
                    return;
                }
                String unit = (String) comboBox.getSelectedItem();
                double factor = 1.0;
                switch (unit) {
                    case "米":
                        factor = 1.0;
                        break;
                    case "厘米":
                        factor = 0.01;
                        break;    // 修改：将factor赋值为0.01
                    case "毫米":
                        factor = 0.001;
                        break;    // 修改：将factor赋值为0.001
                }
                double[] params = showInputDialogAndGetParams(shape, "请输入几何图形的参数（请以空格分隔多个参数）：", factor);
                Object result = get3DShape(shape, params);
                area3D.append(result + "，单位为：" + unit + "\n");
            }
        });
    }    

    private static double[] showInputDialogAndGetParams(String shape, String message, double factor) {
        String input = JOptionPane.showInputDialog(message);
        String[] parts = input.split(" ");
        double[] params = new double[parts.length];
        try {
            for (int i = 0; i < parts.length; i++) {
                params[i] = Double.parseDouble(parts[i]);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "参数格式不正确！");
            return null;
        }
        switch (shape) {
            case "线段":
                if (params.length != 1) {
                    JOptionPane.showMessageDialog(null, "线段需要且仅需要一个参数！");
                    return null;
                }
                break;
            case "角":
                if (params.length != 1) {
                    JOptionPane.showMessageDialog(null, "角需要且仅需要一个参数！");
                    return null;
                }
                break;
            case "三角形":
                if (params.length != 2) {
                    JOptionPane.showMessageDialog(null, "三角形需要且仅需要两个参数！");
                    return null;
                }
                break;
            case "正方形":
                if (params.length != 1) {
                    JOptionPane.showMessageDialog(null, "正方形需要且仅需要一个参数！");
                    return null;
                }
                break;
            case "长方形":
                if (params.length != 2) {
                    JOptionPane.showMessageDialog(null, "长方形需要且仅需要两个参数！");
                    return null;
                }
                break;
            case "平行四边形":
                if (params.length != 2) {
                    JOptionPane.showMessageDialog(null, "平行四边形需要且仅需要两个参数！");
                    return null;
                }
                break;
            case "梯形":
                if (params.length != 3) {
                    JOptionPane.showMessageDialog(null, "梯形需要且仅需要三个参数！");
                    return null;
                }
                break;
            case "菱形":
                if (params.length != 2) {
                    JOptionPane.showMessageDialog(null, "菱形需要且仅需要两个参数！");
                    return null;
                }
                break;
            case "圆形":
                if (params.length != 1) {
                    JOptionPane.showMessageDialog(null, "圆形需要且仅需要一个参数！");
                    return null;
                }
                break;
            case "扇形":
                if (params.length != 2) {
                    JOptionPane.showMessageDialog(null, "扇形需要且仅需要两个参数！");
                    return null;
                }
                break;
            case "正方体":
                if (params.length != 1) {
                    JOptionPane.showMessageDialog(null, "正方体需要且仅需要一个参数！");
                    return null;
                }
                break;
            case "长方体":
                if (params.length != 3) {
                    JOptionPane.showMessageDialog(null, "长方体需要且仅需要三个参数！");
                    return null;
                }
                break;
            case "圆柱体":
                if (params.length != 2) {
                    JOptionPane.showMessageDialog(null, "圆柱体需要且仅需要两个参数！");
                    return null;
                }
                break;
            case "圆锥体":
                if (params.length != 2) {
                    JOptionPane.showMessageDialog(null, "圆锥体需要且仅需要两个参数！");
                    return null;
                }
                break;
        }      
        for (int i = 0; i < params.length; i++) {
            params[i] *= factor;
        }
        return params;
    }
}
